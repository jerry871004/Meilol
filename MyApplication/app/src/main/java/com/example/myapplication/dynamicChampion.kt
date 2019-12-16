//package com.example.myapplication
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ArrayAdapter
//import android.widget.ListView
//import androidx.fragment.app.Fragment
//import android.content.Context
//import kotlinx.android.synthetic.main.fragment_fragment20.view.*
//
//class dynamicChampion :Fragment(){
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val inflate = inflater!!.inflate(R.layout.fragment_fragment20, container, false)
//
//        var listview = inflate.findViewById(R.id.list_id) as ListView
//        var info :ArrayList<ListView_save> = ArrayList()
//
//        info.add(ListView_save("冰鳥",R.drawable.anivia))
//        info.add(ListView_save("刮哥",R.drawable.darius))
////        info.add(ListView_save("乞丐大劍",R.drawable.garen))
////        info.add(ListView_save("桶子",R.drawable.gragas))
////        info.add(ListView_save("卡撒",R.drawable.kaisa))
////        info.add(ListView_save("滑起來",R.drawable.kalista))
////        info.add(ListView_save("李星",R.drawable.leesin))
////        info.add(ListView_save("雷歐娜",R.drawable.leona))
////        info.add(ListView_save("娜米",R.drawable.nami))
////        info.add(ListView_save("賽恩",R.drawable.sion))
//
//        listview.adapter = CustomAdapter(requireContext(),info)
//
//        return inflate
//    }
//}