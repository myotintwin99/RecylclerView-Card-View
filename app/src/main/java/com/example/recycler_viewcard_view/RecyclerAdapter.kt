package com.example.recycler_viewcard_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private var titles:List<String>,
private  var desc:List<String>,private  var img:List<Int>) :RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>(){

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemtitle:TextView=itemView.findViewById(R.id.title)
        val itemd:TextView=itemView.findViewById(R.id.desc)
        val itemim:ImageView=itemView.findViewById(R.id.img)

        init {
            itemView.setOnClickListener { v:View->
                val position:Int=adapterPosition
                Toast.makeText(itemView.context,"You clicked on item ${position+1}",Toast.LENGTH_SHORT).show()

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val rv=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ItemViewHolder(rv)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemtitle.text=titles[position]
        holder.itemd.text=desc[position]
        holder.itemim.setImageResource(img[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}