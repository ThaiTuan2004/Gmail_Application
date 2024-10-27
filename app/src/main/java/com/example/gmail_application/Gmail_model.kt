package com.example.gmail_application

import java.time.LocalDateTime

data class Gmail_model(val imageResId: Int, val sender:String, val title: String, val content: String, val dateTime: LocalDateTime)
