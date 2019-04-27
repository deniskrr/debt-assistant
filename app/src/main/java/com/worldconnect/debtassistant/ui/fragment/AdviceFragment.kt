package com.worldconnect.debtassistant.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.worldconnect.debtassistant.R
import com.worldconnect.debtassistant.ui.activities.HomeActivity
import com.worldconnect.debtassistant.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.fragment_advice.*


class AdviceFragment : Fragment() {

    private lateinit var testViewModel: TestViewModel
    private var yesAnswers: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        testViewModel = ViewModelProviders.of(activity!!).get(TestViewModel::class.java)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_advice, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        yesAnswers = arguments!!.getInt(HomeActivity.YES)
        text_advice.text = when (yesAnswers) {
            in 0..2 -> resources.getString(R.string.advice_two)
            in 3..5 -> resources.getString(R.string.advice_five)
            in 6..9 -> resources.getString(R.string.advice_nine)
            else -> resources.getString(R.string.advice_twelve)
        }
    }
}
