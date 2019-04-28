package com.worldconnect.debtassistant.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.worldconnect.debtassistant.R
import com.worldconnect.debtassistant.ui.activities.StartActivity
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

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
    }
}