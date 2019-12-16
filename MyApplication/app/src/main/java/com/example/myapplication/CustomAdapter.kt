package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class CustomAdapter(var context: Context,var champion:ArrayList<ListView_save>):BaseAdapter() {

    private class ViewHolder(row:View?){
        var txtName : TextView
        var ivImage : ImageView
        var txtMatchend : TextView
        var txtScore : TextView
        var txtCs : TextView
        var txtMoney : TextView
        var txtDate : TextView
        var txtTime : TextView

        init{
            this.txtName = row?.findViewById(R.id.championName) as TextView
            this.ivImage = row?.findViewById(R.id.championPic) as ImageView
            this.txtMatchend = row?.findViewById(R.id.matchEnd_id) as TextView
            this.txtScore = row?.findViewById(R.id.Scroe_id) as TextView
            this.txtCs = row?.findViewById(R.id.cs_id) as TextView
            this.txtMoney = row?.findViewById(R.id.money_id) as TextView
            this.txtDate = row?.findViewById(R.id.date_id) as TextView
            this.txtTime = row?.findViewById(R.id.time_id) as TextView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if(convertView==null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.champion_list,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var cham: ListView_save = getItem(position) as ListView_save
        viewHolder.txtName.text = cham.name
        viewHolder.ivImage.setImageResource(cham.image)
        viewHolder.txtMatchend.text = cham.matchEnd
        viewHolder.txtScore.text = cham.Scroe
        viewHolder.txtCs.text = cham.cs
        viewHolder.txtMoney.text = cham.money
        viewHolder.txtDate.text = cham.date
        viewHolder.txtTime.text = cham.time

        return  view as View
    }

    override fun getItem(position: Int): Any {
        return champion.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return champion.count()
    }

}