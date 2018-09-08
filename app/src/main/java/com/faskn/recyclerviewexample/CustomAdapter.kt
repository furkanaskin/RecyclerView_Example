package com.faskn.recyclerviewexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide


class CustomAdapter(val categoriesList: ArrayList<CategoriesDTO>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val imgCategory = holder.itemView.findViewById<ImageView>(R.id.imgCategory)
        Glide.with(holder.itemView).load(categoriesList[position].imgURL).into(imgCategory)
        holder.txtCategoryTitle?.text = categoriesList[position].title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.category_items_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imgCategory = itemView.findViewById<ImageView>(R.id.imgCategory)
        val txtCategoryTitle = itemView.findViewById<TextView>(R.id.txtCategoryTitle)


    }


}