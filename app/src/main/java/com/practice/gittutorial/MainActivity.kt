package com.practice.gittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this@MainActivity,"This is my master branch",Toast.LENGTH_LONG).show()
        Toast.makeText(this@MainActivity,"This is my latest meesage",Toast.LENGTH_LONG).show()
    }
}