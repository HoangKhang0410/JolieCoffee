package com.example.joliecafe.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.joliecafe.R
import com.smarteist.autoimageslider.SliderViewAdapter

class ImageSliderAdapter : SliderViewAdapter<ImageSliderAdapter.SliderViewHolder>() {

    private var mSliderItems = ArrayList<Int>()

    fun renewItems(sliderItems: ArrayList<Int>) {
        mSliderItems = sliderItems
        notifyDataSetChanged()
    }

    fun addItem(sliderItem: Int) {
        mSliderItems.add(sliderItem)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderViewHolder {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_image_slider, null)
        return SliderViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        //load image into view
        val item = mSliderItems[position]
        //Picasso.get().load(mSliderItems[position]).fit().into(viewHolder.imageView)
        holder.imageView.setImageResource(item);
    }

    override fun getCount(): Int {
        return mSliderItems.size
    }

    inner class SliderViewHolder(itemView: View) : ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.iv_slider)

    }
}