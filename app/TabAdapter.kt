package com.example.ipt2_login

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3 // Number of tabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Tab1() // Fragment for first tab
            1 -> Tab2() // Fragment for second tab (create Tab2 as needed)
            2 -> Tab3() // Fragment for third tab (create Tab3 as needed)
            else -> Tab1()
        }
    }
}
