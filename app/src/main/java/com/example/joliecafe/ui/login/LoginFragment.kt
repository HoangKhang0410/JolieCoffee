package com.example.joliecafe.ui.login

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.joliecafe.R
import com.example.joliecafe.databinding.FragmentHomeBinding
import com.example.joliecafe.databinding.FragmentLoginBinding

class LoginFragment: Fragment(R.layout.fragment_login) {

    private val TAG = this.javaClass.simpleName

    private lateinit var binding : FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.button.setOnClickListener {
            Toast.makeText(activity, "Test", Toast.LENGTH_LONG).show()
            navigateToRegisterFragment()
        }
        binding.button2.setOnClickListener{
            Toast.makeText(activity, "Test2", Toast.LENGTH_LONG).show()
            navigateToHomeFragment()
        }
    }

    private fun navigateToHomeFragment() {
        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
    }

    private fun navigateToRegisterFragment(){
        findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
    }
}