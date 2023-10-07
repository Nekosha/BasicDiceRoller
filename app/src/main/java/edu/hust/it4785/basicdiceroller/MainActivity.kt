/** Dice Roller App. Pretty much does what it says on the tin.
 * Written as part of the Mobile App Development course (IT4785) at
 * Hanoi University of Science and Technology.
 * Written Oct 07 2023 - Nekosha (github.com/Nekosha)
 */
package edu.hust.it4785.basicdiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/** Main activity for the Dice Roller App.
 * Provides a button to roll the dice,
 * and displays the result of the roll as a number.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollDiceButton: Button = findViewById(R.id.button_rollDice)
        var diceResult: TextView = findViewById(R.id.dice_result)
        var diceToast: Toast = Toast.makeText(this, R.string.toast_diceRolled, Toast.LENGTH_SHORT)

        rollDiceButton.setOnClickListener {
            diceResult.text = Dice(6).roll().toString()
            diceToast.show()
        }
    }
}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}