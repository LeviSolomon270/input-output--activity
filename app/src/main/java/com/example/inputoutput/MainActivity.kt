package com.example.inputoutput

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.CLICKBTN)
        val displayText = findViewById<TextView>(R.id.Displaytext)
        val nameText = findViewById<EditText>(R.id.NameText)

        clickMeButton?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button clicked",
            Toast.LENGTH_LONG).show()
            nameText.setText("Welcome ${nameText.text}!")
            val zuluSwitch = findViewById<Switch>(R.id.zuluSwitch)
            clickMeButton?.setOnClickListener {
                var greeting: String
                if (zuluSwitch.isChecked) {
                    greeting = "Sawbones, ${nameText.text}!"
                  greeting = "Greetings, ${nameText.text}!"
                    val greeting = if (zuluSwitch.isChecked) {
                        "Sawbones, ${nameText.text}!"
                    } else {
                        "Greetings, ${nameText.text}!"
                    }
                    displayText.text = greeting
                    } else {
            if(nameText.text.toString() == "Tom" ||
                        nameText.text.toString() == "Tommy")
                }
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}