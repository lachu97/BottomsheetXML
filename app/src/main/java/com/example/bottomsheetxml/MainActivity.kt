package com.example.bottomsheetxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val modalBottomSheet = ModalBottomSheet()
       val b = findViewById<Button>(R.id.btn)
        b.setOnClickListener {
            modalBottomSheet.show(supportFragmentManager, ModalBottomSheet.TAG)
        }
    }
}