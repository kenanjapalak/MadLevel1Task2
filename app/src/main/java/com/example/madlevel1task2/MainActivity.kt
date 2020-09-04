package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1task2.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            submitAnswers()
        }

    }

    private fun submitAnswers() {
        var correctCount = 0
        if (rowTwoColumnThree.text.toString() == "T") correctCount++
        if (rowThreeColumnThree.text.toString() == "F") correctCount++
        if (rowFourColumnThree.text.toString() == "F") correctCount++
        if (rowFiveColumnThree.text.toString() == "F") correctCount++
        showAnswersCorrectToast(correctCount)
    }

    /**
     * Displays a successful Toast message.
     */
    private fun showAnswersCorrectToast(correctCount : Int) {

        when(correctCount) {
            0 -> Toast.makeText(this, getString(R.string.zeroCorrect), Toast.LENGTH_SHORT).show()
            1 -> Toast.makeText(this, getString(R.string.oneCorrect), Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(this, getString(R.string.twoCorrect), Toast.LENGTH_SHORT).show()
            3 -> Toast.makeText(this, getString(R.string.threeCorrect), Toast.LENGTH_SHORT).show()
            4 -> Toast.makeText(this, getString(R.string.fourCorrect), Toast.LENGTH_SHORT).show()
        }
    }
}