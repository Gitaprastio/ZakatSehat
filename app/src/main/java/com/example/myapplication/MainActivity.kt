package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.activity.BPJSActivityZakatMenu
import com.example.myapplication.activity.BPJSZakatSehatH
import com.example.myapplication.activity.DonasiPremiTunggal
import com.example.myapplication.activity.WHYUS1

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondonasi= findViewById<Button>(R.id.buttonDonasi)
        buttondonasi.setOnClickListener {
            val intent = Intent(this, WHYUS1::class.java )
            startActivity(intent)
        }

        val buttonpremi= findViewById<Button>(R.id.buttonDonasiPremi)
        buttonpremi.setOnClickListener {
            val intent = Intent(this, DonasiPremiTunggal::class.java )
            startActivity(intent)
        }




//        val intent = intent
//        val totalHitung:Double = intent.getDoubleExtra("totalHitung", 0.0)
//
//
//        var start:Double= 1.0+totalHitung
//        var currentXp:Double=start



        }

    }


