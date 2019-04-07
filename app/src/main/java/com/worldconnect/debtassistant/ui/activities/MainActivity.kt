package com.worldconnect.debtassistant.ui.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.worldconnect.debtassistant.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val NAME = "name"
        val EMAIL = "e-mail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_start_main.setOnClickListener {

            val name = edittext_name_main.text.toString()
            val email = edittext_email_main.text.toString()

            val intent = Intent(baseContext, HomeActivity::class.java)
            intent.putExtra(NAME, name)
                .putExtra(EMAIL, email)

            startActivity(intent)
        }


    }
}
