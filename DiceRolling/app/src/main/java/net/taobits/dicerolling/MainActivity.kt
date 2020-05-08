package net.taobits.dicerolling

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private val rollButton by lazy { findViewById<Button>(R.id.roll_button)!! }
    private val diceImage by lazy { findViewById<ImageView>(R.id.dice_image)!! }
    private val randomGenerator = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val drawableResource = when (randomGenerator.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6 // only 6
        }
        diceImage.setImageResource(drawableResource)
    }
}
