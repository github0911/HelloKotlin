package com.example.hellokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.find

class MainActivity : AppCompatActivity() {

    private var helloTv: TextView? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTv = findViewById(R.id.hello_tv) as TextView
        helloTv!!.text = "Hello Kotlin"
        //此处用了anko的查找控件的方法，看着是不是更简洁了
        button = find(R.id.button1)
        button!!.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivitySecond::class.java)
            startActivity(intent)
        }
    }
}
