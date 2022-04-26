package com.example.joliecafe.ui.favorite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.joliecafe.R
import com.example.joliecafe.databinding.FragmentFavoriteBinding

class FavoriteFragment: Fragment(R.layout.fragment_cart) {

    private val TAG = this.javaClass.simpleName

    private lateinit var binding : FragmentFavoriteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFavoriteBinding.bind(view)
    }
}