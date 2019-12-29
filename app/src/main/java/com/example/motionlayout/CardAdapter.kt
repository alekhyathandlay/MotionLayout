package com.example.motionlayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(val items : List<Card>, val context: Context) : RecyclerView.Adapter<CardAdapter.ViewHolder1>() {

    class ViewHolder1(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each card to
        val title = view.findViewById(R.id.title) as TextView
        val subtitle = view.findViewById(R.id.subtitle) as TextView
        val duration = view.findViewById(R.id.button) as TextView
    }

    // Gets the number of cards in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        return ViewHolder1(LayoutInflater.from(context).inflate(R.layout.card_vv_layout, parent, false))
    }

    // Binds each card in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        holder.title.text = items[position].title
        holder.subtitle.text = items[position].subtitle
        holder.duration.text = items[position].duration.toString()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}

