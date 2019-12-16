package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyPagerAdapter(fm: FragmentManager):FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0->{
                Fragment20()
            }
            1->{
                FragmentPinfo()
            }
            else->{
                return Fragmenother()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"近期對戰"
            1->"玩家資料"
            else->{
                return "幹好累"
            }
        }
    }
}