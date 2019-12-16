package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar_id.setTitle("召喚師資料")
        setSupportActionBar(toolbar_id)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_id.adapter = fragmentAdapter

        tablayout_id.setupWithViewPager(viewpager_id)
    }
}
