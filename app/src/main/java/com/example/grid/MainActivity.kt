package com.example.grid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.bumptech.glide.Glide
import android.widget.GridView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = mutableListOf(
            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg",
            "https://cdn2.thecatapi.com/images/hBXicehMA.jpg",

            "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg",
            "https://cdn2.thecatapi.com/images/ozEvzdVM-.jpg")

        val gridView: GridView = findViewById(R.id.grid)
        gridView.adapter = Adapter(this, array)

    }

    inner class Adapter(private val context: Context, val array: List<String>): BaseAdapter() {
        override fun getCount(): Int {
            return array.size
        }

        override fun getItem(position: Int): Any {
            return array[position]
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val imageView: ImageView

            if (convertView == null) {
                imageView = ImageView(context)
                imageView.layoutParams = AbsListView.LayoutParams(250, 250)
                imageView.scaleType = ImageView.ScaleType.CENTER_CROP

            } else {
                imageView = convertView as ImageView
            }
            Glide.with(imageView.context).load(array[position]).into(imageView)

            return imageView
        }

    }
}