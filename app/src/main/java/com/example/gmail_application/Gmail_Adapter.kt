package com.example.gmail_application

import android.view.LayoutInflater
import android.widget.BaseAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Gmail_Adapter(val list:List<Gmail_model>) :BaseAdapter() {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view= convertView

        if (view==null){
            view=LayoutInflater.from(parent?.context).inflate(R.layout.list_mail,parent,false)
        }

        val gmail=list[position]

        val imageView= view?.findViewById<ImageView>(R.id.sender_avatar)
        val senderView= view?.findViewById<TextView>(R.id.sender)
        val titleView= view?.findViewById<TextView>(R.id.title)
        val contentView= view?.findViewById<TextView>(R.id.content)
        val dateTimeView= view?.findViewById<TextView>(R.id.datetime)

        imageView?.setImageResource(gmail.imageResId)
        senderView?.text=gmail.sender
        dateTimeView?.text=gmail.dateTime.toString()
        contentView?.text=gmail.content
        titleView?.text=gmail.title

        return view!!
    }
}