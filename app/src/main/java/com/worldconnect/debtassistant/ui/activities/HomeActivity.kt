package com.worldconnect.debtassistant.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.worldconnect.debtassistant.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var name : String
    private var email : String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navController = findNavController(R.id.nav_host_fragment)
        nav_view.setupWithNavController(navController)

        name = intent.extras?.get(MainActivity.NAME).toString()
        email = intent.extras?.get(MainActivity.EMAIL).toString()

    }
}
