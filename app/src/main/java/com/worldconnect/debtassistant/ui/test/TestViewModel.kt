package com.worldconnect.debtassistant.ui.test

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is test Fragment"
    }
    val text: LiveData<String> = _text
}