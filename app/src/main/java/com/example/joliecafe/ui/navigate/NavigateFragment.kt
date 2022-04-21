package com.example.joliecafe.ui.navigate

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.joliecafe.R
import com.example.joliecafe.databinding.FragmentNavigateBinding
import com.example.joliecafe.ui.cart.CartFragment
import com.example.joliecafe.ui.favorite.FavoriteFragment
import com.example.joliecafe.ui.home.HomeFragment
import com.example.joliecafe.ui.profile.ProfileFragment

class NavigateFragment : Fragment(R.layout.fragment_navigate) {

    private val TAG = this.javaClass.simpleName

    private lateinit var binding: FragmentNavigateBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNavigateBinding.bind(view)

        binding.bnvHome.setOnItemSelectedListener { item ->
            val frg: Fragment
            val id = item.itemId
            when (id) {
                R.id.bottom_home -> {
                    frg = HomeFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_favorite -> {
                    frg = FavoriteFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_cart -> {
                    frg = CartFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_profile -> {
                    frg = ProfileFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }

    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}