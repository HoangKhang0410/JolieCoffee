package com.example.joliecafe.ui.navigate

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

        loadFragment(HomeFragment())

        binding.bnvHome.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    val frg: Fragment = HomeFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    true
                }
                R.id.bottom_favorite -> {
                    val frg: Fragment = FavoriteFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    true
                }
                R.id.bottom_cart -> {
                    val frg: Fragment = CartFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    true
                }
                R.id.bottom_profile -> {
                    val frg: Fragment = ProfileFragment()
                    loadFragment(frg)
                    //viewModel.setFragment(frg)
                    true
                }
                else -> false
            }
        }

    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        //transaction.addToBackStack(null)
        transaction.commit()
    }


}