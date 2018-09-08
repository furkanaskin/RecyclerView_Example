package com.faskn.recyclerviewexample
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.bumptech.glide.Glide


class FeedAdapter(val context: Context,val feedList: ArrayList<FeedDTO>): BaseAdapter () {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false)
        val feedItem = view.findViewById<ImageView>(R.id.row_imgView)
        Glide.with(feedItem).load(feedList[position].imgURL).into(feedItem)

        feedItem.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(context,"$position. Fotoğraf", LENGTH_SHORT).show()
            }

        })
        return feedItem
    }

    override fun getItem(position: Int): Any {
       return feedList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return feedList.size
    }

    public class Holder {
        lateinit var feedImage : ImageView
    }

}

