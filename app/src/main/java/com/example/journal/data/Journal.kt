package com.example.journal.data

import java.sql.Date

data class Journal(
    val date: Date, //timezone is not important in this app
    val food: Int,
    val work: Int,
    val exercise: Int,
    val overallHumor: Int,
    val comments: String?,
)
