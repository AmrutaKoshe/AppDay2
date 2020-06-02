package com.example.day2task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTap(view: View) {
        count+=1

        val textview = findViewById(R.id.textView) as TextView
        textview.text = "$count"
    }

    fun click(view: View) {
        count = 0

        val textview = findViewById(R.id.textView) as TextView
        textview.text = "$count"
    }
}