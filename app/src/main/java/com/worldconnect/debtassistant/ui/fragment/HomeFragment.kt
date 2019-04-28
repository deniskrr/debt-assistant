package com.worldconnect.debtassistant.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.worldconnect.debtassistant.R
import com.worldconnect.debtassistant.ui.activities.StartActivity
import com.worldconnect.debtassistant.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var testViewModel: TestViewModel

    var name: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        name = activity?.intent?.extras?.get(StartActivity.NAME).toString()
        text_name.text = name

        button_begin_test.setOnClickListener {

            testViewModel = ViewModelProviders.of(activity!!).get(TestViewModel::class.java)
            testViewModel.reset()

            activity!!.nav_view.menu.findItem(R.id.navigation_advice).isEnabled = false
            activity!!.nav_view.menu.findItem(R.id.navigation_test).isEnabled = true

            activity!!.nav_view.selectedItemId = R.id.navigation_test
        }
    }
}