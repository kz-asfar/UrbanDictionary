package com.example.urbandictionary.View

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.urbandictionary.R

class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val tvWord:TextView = itemView.findViewById(R.id.tv_word)
    val tvThumbsUp:TextView = itemView.findViewById(R.id.tv_thumbs_up)
    val tvThumbsDown:TextView = itemView.findViewById(R.id.tv_thumbs_down)
    val tvDefinition:TextView = itemView.findViewById(R.id.tv_definition)
    val tvExample:TextView = itemView.findViewById(R.id.tv_example)

}