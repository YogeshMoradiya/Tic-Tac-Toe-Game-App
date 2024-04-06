package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splshscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splshscreen)


        Handler().postDelayed({
            val intent = Intent(this@Splshscreen,startpage::class.java)
            startActivity(intent)
            finish()
        },1500)

    }
}