package com.example.joliecafe.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.joliecafe.R
import com.example.joliecafe.data.Product
import com.example.joliecafe.databinding.FragmentHomeBinding
import com.example.joliecafe.ui.home.adapter.HomeProductAdapter
import com.example.joliecafe.ui.home.adapter.ImageSliderAdapter
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val TAG = this.javaClass.simpleName

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        val imageList: ArrayList<Int> = ArrayList()
        imageList.add(R.drawable.img_cafe_1)
        imageList.add(R.drawable.img_cafe_1)
        imageList.add(R.drawable.img_cafe_1)
        setImageInSlider(imageList, binding.imageSlider)

        val listProduct: ArrayList<Product> = ArrayList()
        listProduct.add(
            Product(
                1,
                "Latte",
                "Content",
                R.drawable.img_cafe_1,
                "Coffee",
                90000,
                4.8F
            )
        )

        listProduct.add(
            Product(
                2,
                "Mệt mõi",
                "Content",
                R.drawable.img_cafe_1,
                "Coffee",
                90000,
                4.8F
            )
        )
        listProduct.add(
            Product(
                3,
                "Dẹp",
                "Content",
                R.drawable.img_cafe_1,
                "Coffee",
                90000,
                4.8F
            )
        )
        listProduct.add(
            Product(
                4,
                "Chán đời",
                "Content",
                R.drawable.img_cafe_1,
                "Coffee",
                90000,
                4.8F
            )
        )

        binding.rvProduct.layoutManager = LinearLayoutManager(context)
        val homeAdapter = HomeProductAdapter(listProduct)
        binding.rvProduct.adapter = homeAdapter

    }

    private fun setImageInSlider(images: ArrayList<Int>, imageSlider: SliderView) {
        val adapter = ImageSliderAdapter()
        adapter.renewItems(images)
        imageSlider.setSliderAdapter(adapter)
        imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM) //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        imageSlider.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH
        imageSlider.scrollTimeInSec = 3
        imageSlider.isAutoCycle = true
        imageSlider.startAutoCycle()
    }

}