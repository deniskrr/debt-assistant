package com.worldconnect.debtassistant.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.github.paolorotolo.appintro.AppIntro2
import com.github.paolorotolo.appintro.AppIntroFragment
import com.github.paolorotolo.appintro.model.SliderPage
import com.worldconnect.debtassistant.R


class IntroActivity : AppIntro2() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var sliderPage = SliderPage()
        sliderPage.title = "Debt Assistant"
        sliderPage.description = resources.getString(R.string.first)
        sliderPage.imageDrawable = R.drawable.ic_live_help_black_24dp
        sliderPage.bgColor = ResourcesCompat.getColor(resources, R.color.colorPrimary, null)
        addSlide(AppIntroFragment.newInstance(sliderPage))

        sliderPage = SliderPage()
        sliderPage.title = "Your financial situation"
        sliderPage.description = resources.getString(R.string.second)
        sliderPage.imageDrawable = R.drawable.ic_question_answer_black_24dp
        sliderPage.bgColor = ResourcesCompat.getColor(resources, R.color.colorPrimary, null)
        addSlide(AppIntroFragment.newInstance(sliderPage))


        sliderPage = SliderPage()
        sliderPage.title = "Advice"
        sliderPage.description = resources.getString(R.string.third)
        sliderPage.imageDrawable = R.drawable.ic_accessibility_black_24dp
        sliderPage.bgColor = ResourcesCompat.getColor(resources, R.color.colorPrimary, null)
        addSlide(AppIntroFragment.newInstance(sliderPage))


        sliderPage = SliderPage()
        sliderPage.title = "Tips"
        sliderPage.description = resources.getString(R.string.fourth)
        sliderPage.imageDrawable = R.drawable.ic_bookmark_border_black_24dp
        sliderPage.bgColor = ResourcesCompat.getColor(resources, R.color.colorPrimary, null)
        addSlide(AppIntroFragment.newInstance(sliderPage))

    }

    override fun isSkipButtonEnabled(): Boolean {
        return true
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
