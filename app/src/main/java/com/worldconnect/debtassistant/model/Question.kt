package com.worldconnect.debtassistant.model

enum class Answer {
    NO, YES, UNANSWERED
}

data class Question(val question: String, val answer: Answer = Answer.UNANSWERED) {
    override fun toString(): String {
        return question
    }
}