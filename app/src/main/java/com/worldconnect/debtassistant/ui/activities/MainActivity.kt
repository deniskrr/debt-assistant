package com.worldconnect.debtassistant.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

            val name = textlayout_name_main.editText?.text.toString()
            val email = textlayout_email_main.editText?.text.toString()

            val intent = Intent(baseContext, HomeActivity::class.java)
            intent.putExtra(NAME, name)
                .putExtra(EMAIL, email)

            startActivity(intent)
        }


    }
}
