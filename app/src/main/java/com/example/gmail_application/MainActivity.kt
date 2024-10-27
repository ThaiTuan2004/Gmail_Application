package com.example.gmail_application

import android.os.Build
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val gmailList= listOf(
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),
            Gmail_model(R.mipmap.ic_launcher,"TunaDang","Title1","Content1", LocalDateTime.now()),

        )
        val adapter=Gmail_Adapter(gmailList)
        listView.adapter=adapter
        }
    }