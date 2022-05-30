package com.example.hellotoast

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastButton: Button = findViewById(R.id.buttonToast)
        val countButton: Button = findViewById(R.id.buttonIncrement)
        val textView:TextView=findViewById(R.id.textView)
        val decrementButton: Button = findViewById(R.id.buttonDecrement)

        textView.text = counter.toString()

        toastButton.setOnClickListener {
            showToast(this)
        }
        decrementButton.setOnClickListener {
            decrementCounter(textView)
        }

        countButton.setOnClickListener {
            incrementCounter(textView)
        }
    }

    fun showToast(context: Context) {
        Toast.makeText(context, "Hello Toast", Toast.LENGTH_SHORT).show()
    }

    fun incrementCounter(textView: TextView) {
        counter = counter + 1
        textView.text = counter.toString()
    }

    fun decrementCounter(textView: TextView){
        counter = counter-1
        textView.text = counter.toString()

    }
}