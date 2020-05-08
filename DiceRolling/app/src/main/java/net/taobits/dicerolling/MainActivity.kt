package net.taobits.dicerolling

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var rollButton: Button
    lateinit var resultText: TextView
    val randomGenerator = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
        resultText = findViewById<TextView>(R.id.result_text)

    }

    private fun rollDice() {
        val randomInt = randomGenerator.nextInt(6) + 1
        resultText.text = randomInt.toString()
    }
}
