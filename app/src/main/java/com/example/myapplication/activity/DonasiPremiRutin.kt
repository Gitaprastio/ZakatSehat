package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class DonasiPremiRutin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donasi_premi_rutin)

        val buttonpremiswitchs= findViewById<Button>(R.id.buttonRutinBayarC)
        buttonpremiswitchs.setOnClickListener {
            val intent = Intent(this, DonasiPremiCheckOuts::class.java )
            startActivity(intent)
        }



    }
}