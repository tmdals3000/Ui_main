package com.example.ui_main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        tabLayout.setBackgroundResource(R.color.tab_selected_background)
                    }
                    1 -> {
                        val intent = Intent(this@MainActivity, Sub1Activity::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(this@MainActivity, Sub2Activity::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                if (tab.position == 0) {
                    tabLayout.setBackgroundResource(R.color.tab_unselected_background)
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                // 다시 선택 시 처리할 내용
            }
        })
    }
}
