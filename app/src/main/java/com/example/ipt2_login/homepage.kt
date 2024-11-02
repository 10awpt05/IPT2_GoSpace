package com.example.ipt2_login



import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class home : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)




        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        viewPager = findViewById(R.id.view_pager)

        viewPager.adapter = TabAdapter(this)


//--------------------------------------TAB NAVIGATION----------------------------------------//
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                  //  tab.text = "Home"
                    tab.setIcon(R.drawable.homeicon)
                }
                1 -> {
                  //  tab.text = "Room"
                    tab.setIcon(R.drawable.room1)
                }
                2 -> {
                   // tab.text = "Profile"
                    tab.setIcon(R.drawable.profileicon)
                }
            }
        }.attach()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}