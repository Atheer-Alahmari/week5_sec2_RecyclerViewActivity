package com.example.week5_sec2_recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            var n1=editText.text.toString()
            var n2=editText2.text.toString()
            var n3=editText3.text.toString()
            var n4=editText4.text.toString()

            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("sendName1", n1)
            intent.putExtra("sendName2", n2)
            intent.putExtra("sendName3", n3)
            intent.putExtra("sendName4", n4)
            startActivity(intent)
        }
    }
}