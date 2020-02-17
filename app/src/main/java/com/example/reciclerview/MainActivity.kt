package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
            val albums =ArrayList<Album>()

        albums.add(Album("Plácido Domingo",23,R.drawable.album1))
        albums.add(Album("Beyonde",13,R.drawable.album2))
        albums.add(Album("Bocelli",30,R.drawable.album3))
        albums.add(Album("Estrella",10,R.drawable.album4))

        val adapter=AdapterAlbum(albums)
        recycler.adapter=adapter




    }
}
