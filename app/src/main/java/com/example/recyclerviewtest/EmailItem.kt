package com.example.recyclerviewtest

data class EmailItem(
    val senderInitial: Char,
    val senderName: String,
    val subject: String,
    val preview: String,
    val time: String,
    val isStarred: Boolean = false
)
