package com.example.urbandictionary.View

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.urbandictionary.Model.PokoResponse
import com.example.urbandictionary.R

class CustomAdapter internal constructor(context: Context)
    : RecyclerView.Adapter<CustomViewHolder>() {
    private val inflater = LayoutInflater.from(context)
    var list = emptyList<PokoResponse>()
    set(value){
        field = value
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView = inflater.inflate(R.layout.item_layout, parent, false)
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.tvDefinition.text = list.get(position).list.definition
        holder.tvThumbsUp.text = list.get(position).list.thumbs_up
        holder.tvThumbsDown.text = list.get(position).list.thumbs_down
        holder.tvExample.text = list.get(position).list.example

    }

    override fun getItemCount() = list.size
}