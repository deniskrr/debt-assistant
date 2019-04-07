package com.worldconnect.debtassistant.ui.overview

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class OverviewViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is overview Fragment"
    }
    val text: LiveData<String> = _text
}