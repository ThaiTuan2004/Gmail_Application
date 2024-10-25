package com.example.gmail_application

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val gmailList= listOf(
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
            Gmail_model(R.mipmap.ic_launcher,"Gmail1","Test1"),
        )
        val adapter=Gmail_Adapter(gmailList)
        listView.adapter=adapter
        }
    }