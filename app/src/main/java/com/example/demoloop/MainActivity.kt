package com.example.demoloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener(View.OnClickListener {
            for(i in 1..5){
                Log.i("MainActivity", "$i")

            }

            var wI = 1
            while (wI < 6){
                Log.i("MainActivity", "$wI")
                wI++
            }
        })

        btnLetter.setOnClickListener(View.OnClickListener {
            val word = etWord.text.toString()

            for(letter in word){
                Log.i("MainActivity", "$letter")
            }
        })
    }
}
