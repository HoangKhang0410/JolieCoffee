package com.example.joliecafe.ui.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.joliecafe.R
import com.example.joliecafe.databinding.FragmentProfileBinding
import com.example.joliecafe.ui.navigate.NavigateFragment

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val TAG = this.javaClass.simpleName

    private lateinit var binding: FragmentProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding.btEditProfile.setOnClickListener {
            navigationToEditProfile()
        }
    }

    private fun navigationToEditProfile(){
        findNavController().navigate(R.id.action_navigateFragment_to_editProfileFragment)
    }
}