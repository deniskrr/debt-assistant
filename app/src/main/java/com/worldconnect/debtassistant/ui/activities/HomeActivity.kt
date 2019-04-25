package com.worldconnect.debtassistant.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.worldconnect.debtassistant.R
import com.worldconnect.debtassistant.model.Question
import com.worldconnect.debtassistant.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var name: String
    private var email: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val questions = resources.getStringArray(R.array.questions).map { question -> Question(question) }

        val testViewModel =
            ViewModelProviders.of(this).get(TestViewModel::class.java)
        testViewModel.questions = questions

        val navController = findNavController(R.id.nav_host_fragment)
        nav_view.setupWithNavController(navController)

    }
}
