package com.example.myapplication.tuan312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class tuan312MainActivity : AppCompatActivity() {
    var adap:tuan312adapter? = null
    var ls: ArrayList<tuan312contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)
        var lv=findViewById<ListView>(R.id.tuan312lv)
        ls.add(tuan312contact("Nghuyen Van A", "18", R.drawable.android))
        ls.add(tuan312contact("Tran Van A", "20", R.drawable.hp))
        ls.add(tuan312contact("Vu Van C", "17", R.drawable.dell))
        ls.add(tuan312contact("Nghuyen Thi A", "18", R.drawable.ie))
        ls.add(tuan312contact("Nghuyen Van A", "18", R.drawable.hancock))

        adap=tuan312adapter(this,ls)
        lv.adapter=adap
    }
}