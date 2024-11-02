package com.example.ipt2_login

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3 // Number of tabs/fragments
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Tab1() // First tab's fragment
            1 -> tab2() // Second tab's fragment
            2 -> tab3() // Third tab's fragment
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}
