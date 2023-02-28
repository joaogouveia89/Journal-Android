package com.example.journal.ui.todayjournal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodayJournalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Today journal Fragment"
    }
    val text: LiveData<String> = _text
}