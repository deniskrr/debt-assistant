package com.worldconnect.debtassistant.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.worldconnect.debtassistant.model.Question

class TestViewModel : ViewModel() {

    var yesCount = 0


    private val _questionNumber = MutableLiveData<Int>().apply {
        postValue(0)
    }

    fun reset() {
        _questionNumber.value = 0
        yesCount = 0
    }

    fun nextQuestion() {
        if (_questionNumber.value != null) {
            var newNumber = _questionNumber.value
            if (newNumber != null && newNumber != questions.size) newNumber++
            _questionNumber.value = newNumber
        }
    }

    val questionNumber: LiveData<Int> = _questionNumber

    lateinit var questions: List<Question>

    var currentQuestion: Question? = null

}