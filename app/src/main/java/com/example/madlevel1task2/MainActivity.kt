package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews(){
        binding.submitButton.setOnClickListener { checkAnswers() }
    }



    private fun checkAnswers(){
        val answer_1 = binding.answer1.text.toString()
        val answer_2 = binding.answer2.text.toString()
        val answer_3 = binding.answer3.text.toString()
        val answer_4 = binding.answer4.text.toString()
        var incorrectText = "The answer can only contain a t or a f!"
        var totaalGoed = 0

        if (answer_1.toLowerCase() != "t" && answer_1.toLowerCase() != "f"){
            binding.answer1.setError(incorrectText)
        }else if (answer_1.toLowerCase() == "t"){
            totaalGoed++
        }

        if (answer_2.toLowerCase() != "t" && answer_2.toLowerCase() != "f"){
            binding.answer2.setError(incorrectText)
        }else if (answer_2.toLowerCase() == "f"){
            totaalGoed++
        }

        if (answer_3.toLowerCase() != "t" && answer_3.toLowerCase() != "f"){
            binding.answer3.setError(incorrectText)
        }else if (answer_3.toLowerCase() == "f"){
            totaalGoed++
        }

        if (answer_4.toLowerCase() != "t" && answer_4.toLowerCase() != "f"){
            binding.answer4.setError(incorrectText)
        }else if (answer_4.toLowerCase() == "f"){
            totaalGoed++
        }

        Toast.makeText(this, "You got " + totaalGoed +  " questions right!", Toast.LENGTH_LONG).show()


    }
}