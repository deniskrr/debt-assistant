package com.worldconnect.debtassistant.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TipsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is tips Fragment"
    }
    val text: LiveData<String> = _text
}