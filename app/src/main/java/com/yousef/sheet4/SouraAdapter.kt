package com.yousef.sheet4

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SouraAdapter(var models: List<Model>) : RecyclerView.Adapter<SouraAdapter.SouraHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SouraHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_soura,parent,false)
        return SouraHolder(view)
    }

    override fun onBindViewHolder(holder: SouraHolder, position: Int) {
        val model= models[position]
        holder.souraName.text=model.soura
        holder.itemView.setOnClickListener {
            val intent=Intent(it.context,MainActivity2::class.java)
            intent.putExtra("Soura",model.soura)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return models.size
    }


    class SouraHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val souraName = itemView.findViewById<TextView>(R.id.souraName)!!
    }
}