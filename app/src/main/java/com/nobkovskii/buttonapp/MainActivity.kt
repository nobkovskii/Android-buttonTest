package com.nobkovskii.buttonapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flag = false

        val button = findViewById<Button>(R.id.button) as Button
        val textView = findViewById<TextView>(R.id.textview) as TextView

        button.setOnClickListener {
            if(flag){
                textView.setText(getString(R.string.hello))
                flag = false
            }else {
                textView.setText(getString(R.string.world))
                flag = true
            }
        }
    }
}
