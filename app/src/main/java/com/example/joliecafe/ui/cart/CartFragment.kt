package com.example.joliecafe.ui.cart

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.joliecafe.R
import com.example.joliecafe.databinding.FragmentCartBinding
import com.example.joliecafe.databinding.FragmentHomeBinding

class CartFragment: Fragment(R.layout.fragment_cart) {

    private val TAG = this.javaClass.simpleName

    private lateinit var binding : FragmentCartBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCartBinding.bind(view)
    }
}