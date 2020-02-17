package com.example.reciclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_item.*
import kotlinx.android.synthetic.main.content_item.view.*


class AdapterAlbum (var list:ArrayList<Album>): RecyclerView.Adapter<AdapterAlbum.ViewHolder>() {

 class ViewHolder(view:View):RecyclerView.ViewHolder(view){

     fun bindItem(data:Album){

         itemView.tvtexto.text=data.nombre.toString()
         itemView.tvcount.text=data.numofsong.toString()
         Glide.with(itemView.context).load(data.thmbnail).into(itemView.thumbnail)
         itemView.setOnClickListener{
             Toast.makeText(itemView.context,"Album de ${data.nombre}",Toast.LENGTH_LONG).show()
         }
     }
 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val v=LayoutInflater.from(parent.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder (v)
    }

    override fun getItemCount(): Int {
      return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindItem(list[position])
    }
}