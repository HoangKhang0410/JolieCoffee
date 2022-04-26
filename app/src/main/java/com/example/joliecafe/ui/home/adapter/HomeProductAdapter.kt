package com.example.joliecafe.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.joliecafe.data.Product
import com.example.joliecafe.databinding.ItemHomeProductBinding
import com.example.joliecafe.util.convertPrice

class HomeProductAdapter(private val listProduct: List<Product>): RecyclerView.Adapter<HomeProductAdapter.VH>() {


    class VH(private val binding: ItemHomeProductBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.tvName.text = product.name
            binding.tvCategory.text = product.category
            binding.tvPrice.text = product.price.convertPrice()
            binding.tvRating.text = product.rating.toString()
            binding.ivProduct.setImageResource(product.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = ItemHomeProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = listProduct[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }
}