package com.example.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

/**
 * A simple [Fragment] subclass.
 */
class Fragment20 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater!!.inflate(R.layout.fragment_fragment20, container, false)

        var listview = inflate.findViewById(R.id.list_id) as ListView
        var info :ArrayList<ListView_save> = ArrayList()
        info.add(ListView_save("冰鳥",R.drawable.anivia,"VICTORY","6/6/6","145","18000","2019/10/10","45:00"))
        info.add(ListView_save("刮哥",R.drawable.darius,"DEFEAT","0/6/0","0","20000","2019/10/4","20:00"))
        info.add(ListView_save("乞丐大劍",R.drawable.garen,"VICTORY","4/2/1","76","10000","2019/10/3","36:00"))
        info.add(ListView_save("桶子",R.drawable.gragas,"VICTORY","1/0/6","127","5000","2019/10/12","38:00"))
        info.add(ListView_save("卡撒",R.drawable.kaisa,"VICTORY","7/7/7","300","7800","2019/10/5","30:34"))
        info.add(ListView_save("滑起來",R.drawable.kalista,"VICTORY","6/6/6","0","6666","2019/10/6","30:43"))
        info.add(ListView_save("李星",R.drawable.leesin,"VICTORY","6/6/6","60","8888","2019/10/8","30:55"))
        info.add(ListView_save("雷歐娜",R.drawable.leona,"VICTORY","6/6/6","99","6666","2019/10/30","31:00"))
        info.add(ListView_save("娜米",R.drawable.nami,"VICTORY","6/6/6","0","7777","2019/10/21","10:00"))
        info.add(ListView_save("賽恩",R.drawable.sion,"VICTORY","9/9/9","2","1","2019/10/11","20:00"))

        listview.adapter = CustomAdapter(requireContext(),info)

        return inflate
    }
}
