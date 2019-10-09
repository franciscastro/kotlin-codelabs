package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a reference to the Buttons
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener{ countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{ reset() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1

        // Get a reference to the TextView
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {

        // Get a reference to the TextView
        val resultText: TextView = findViewById(R.id.result_text)

        // Check the text in the TextView: if it's the default, set to 1
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        }
        // Otherwise, increment
        else {
            // Get the text, then convert the text to String, then to Int
            var resultInt = resultText.text.toString().toInt()

            // Increment only if < 6
            if (resultInt < 6) {
                resultInt++

                // Convert the int to string, then set the TextView text
                resultText.text = resultInt.toString()
            }
        }
    }

    private fun reset() {

        // Get a reference to the TextView
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = "0"

    }

}
