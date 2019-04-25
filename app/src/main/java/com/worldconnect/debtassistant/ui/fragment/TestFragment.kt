package com.worldconnect.debtassistant.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.worldconnect.debtassistant.R
import com.worldconnect.debtassistant.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.fragment_test.*

class TestFragment : Fragment() {

    private lateinit var testViewModel: TestViewModel

    private fun displayQuestion() {
        radio_answers.clearCheck()
        testViewModel.currentQuestion = testViewModel.questions.get(testViewModel.questionNumber.value!!)
        text_question_number.text = "Question ${testViewModel.questionNumber.value} / ${testViewModel.questions.size}"
        text_question.text = testViewModel.currentQuestion.toString()
        if (testViewModel.questionNumber.value == testViewModel.questions.size - 1) {
            button_next.text = "Finish"
        }
    }

    private fun displayResult() {
        button_next.text = "See advice"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        testViewModel = ViewModelProviders.of(activity!!).get(TestViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_test, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        testViewModel.questionNumber.observe(this, Observer {
            if (testViewModel.questionNumber.value != testViewModel.questions.size) {
                displayQuestion()
            } else {
                displayResult()
            }
        })

        button_next.setOnClickListener {
            if (radio_answers.checkedRadioButtonId != -1) {
                if (radio_yes.isChecked) testViewModel.yesCount++
                testViewModel.nextQuestion()
            }
        }
    }
}