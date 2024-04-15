package com.example.turningphone

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Landscape or Portrait"

        var button1 = findViewById<Button>(R.id.button)


        button1.setOnClickListener {
            if( button1.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                Toast.makeText(
                    this@MainActivity,
                    "Hi",
                    Toast.LENGTH_SHORT
                ).show()
            } else{
                Toast.makeText(
                    this@MainActivity,
                    "Hi",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

}