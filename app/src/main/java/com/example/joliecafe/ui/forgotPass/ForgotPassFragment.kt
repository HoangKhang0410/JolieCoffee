package com.example.joliecafe.ui.forgotPass

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.joliecafe.R
import com.example.joliecafe.databinding.FragmentFavoriteBinding
import com.example.joliecafe.databinding.FragmentForgotPassBinding

class ForgotPassFragment: Fragment(R.layout.fragment_forgot_pass) {

    private val TAG = this.javaClass.simpleName

    private lateinit var binding : FragmentForgotPassBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForgotPassBinding.bind(view)
    }
}