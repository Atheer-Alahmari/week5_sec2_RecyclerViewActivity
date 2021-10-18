package com.example.week5_sec2_recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var list_RV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //nameTV=findViewById(R.id.textView)
        val n1=intent.getStringExtra("sendName1").toString()
        val n2=intent.getStringExtra("sendName2").toString()
        val n4=intent.getStringExtra("sendName3").toString()
        val n3=intent.getStringExtra("sendName4").toString()
       // nameTV.setText(sendName )

        list_RV=findViewById(R.id.recyclerView)// Recycler View


        var listOf_Name=ArrayList<String>()

         listOf_Name.add(n1) // add to list for Recycler View
        listOf_Name.add(n2)
        listOf_Name.add(n3)
        listOf_Name.add(n4)

        list_RV.adapter=RV_Adapter(listOf_Name)
        list_RV.layoutManager= LinearLayoutManager(this)

        list_RV.adapter?.notifyDataSetChanged()
        list_RV.scrollToPosition(listOf_Name.size - 1)//Black Belt (Automatically scroll to the bottom of the Recycler View when entering new items)


    }
}