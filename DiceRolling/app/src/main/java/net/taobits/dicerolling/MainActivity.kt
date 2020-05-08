package net.taobits.dicerolling

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "button click", Toast.LENGTH_SHORT).show()
        }
    }
}
