package com.example.recycler_viewcard_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  var titleslist= mutableListOf<String>()
    private  var desclist= mutableListOf<String>()
    private var imglist= mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    postToList()
    val rvv=findViewById<RecyclerView>(R.id.recyclerview)
        rvv.adapter=RecyclerAdapter(titleslist,desclist,imglist)
        rvv.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)

    }

    private fun addToList(title:String,description:String,image:Int){
        titleslist.add(title)
        desclist.add(description)
        imglist.add(image)
    }

    private fun postToList(){
        for(i in 1..30){
            addToList("Title $i","Description $i",R.mipmap.ic_launcher_round)
        }
    }
}