package com.example.inputoutput

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    enum class languages {
        English,
        Afrikaans,
        isiZulu,
        Xhosa,
        }

    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.CLICKBTN)
        val displayText = findViewById<TextView>(R.id.Displaytext)
        val nameText = findViewById<EditText>(R.id.NameText)
        val zuluSwitch = findViewById<Switch>(R.id.zuluSwitch)
        val langaugeSpinner = findViewById<Spinner>(R.id.Languages)
        langaugeSpinner.adapter = ArrayAdapter(
            MainActivity, android.R.layout.simple_spinner_item,
            languages.values()
        )


        clickMeButton?.setOnClickListener {
//            val name = nameText.text.toString()
//            val age: Int = 20 // Fixed: Int should be a number, not a "String"
//
//            // Use if-expression to decide greeting
//            val greeting = if (zuluSwitch.isChecked) {
//                "Sawubona, $name!"
//            } else {
//                "Greetings, $name!"
//            }
//
//            // Update the UI
//            displayText.text = greeting
//
//            // Handle special names
//            if (name.equals("Tom", ignoreCase = true) || name.equals("Tommy", ignoreCase = true)) {
//                Toast.makeText(this, "Welcome back, $name!", Toast.LENGTH_SHORT).show()
//            }
//        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
