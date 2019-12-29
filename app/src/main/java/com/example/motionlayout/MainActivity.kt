package com.example.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    var card1 = Card("title1", "subtitle1", 2)
    var card2 = Card("title2", "subtitle2", 5)
    var card3 = Card("title3", "subtitle3", 1)
    var card4 = Card("title4", "subtitle4", 3)
    var card5 = Card("title5", "subtitle5", 4)
    var card6 = Card("title6", "subtitle6", 6)
    var myDataset = listOf(
        card1, card2, card3, card4, card5, card6,
        card1, card2, card3, card4, card5, card6,
        card1, card2, card3, card4, card5, card6,
        card1, card2, card3, card4, card5, card6,
        card1, card2, card3, card4, card5, card6,
        card1, card2, card3, card4, card5, card6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = CardAdapter(myDataset, this)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
        Toast.makeText(applicationContext, "Hello there", Toast.LENGTH_LONG).show()
    }
}

data class Card(val title: String, val subtitle: String, val duration: Int)
