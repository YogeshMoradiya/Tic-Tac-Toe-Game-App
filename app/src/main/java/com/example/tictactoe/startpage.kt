package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class startpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startpage)

        val startbtn: Button = findViewById(R.id.startbtn)
        val playerOneEditText: EditText = findViewById(R.id.playerOne)
        val playerTwoEditText: EditText = findViewById(R.id.playerTwo)



        startbtn.setOnClickListener {

            val playerOneName = playerOneEditText.text.toString()
            val playerTwoName = playerTwoEditText.text.toString()

            if (playerOneName.isEmpty() || playerTwoName.isEmpty()) {
                Toast.makeText(this@startpage, "Please enter both player names", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@startpage, MainActivity::class.java)
                intent.putExtra("playerOne", playerOneName)
                intent.putExtra("playerTwo", playerTwoName)
                startActivity(intent)
                finish()
            }
        }
    }
    override fun onBackPressed() {
        AlertDialog.Builder(this,R.style.ExitDialog)
            .setMessage("Are you sure you want to exit?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id ->
                super.onBackPressed()
            }
            .setNegativeButton("No") { dialog, id ->
                dialog.dismiss()
            }
            .show()
            .apply {
                getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(this@startpage, R.color.lavender))
                getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(this@startpage, R.color.lavender))
            }

    }
}
