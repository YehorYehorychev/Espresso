package com.gorter.myquizapp.tests


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.gorter.myquizapp.MainActivity
import com.gorter.myquizapp.R
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class RecordedTest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun recordedTest() {
        val appCompatEditText = onView(
            allOf(withId(R.id.et_name), isDisplayed())
        )
        appCompatEditText.perform(replaceText("My Name Is Yehor"), closeSoftKeyboard())

        val materialButton = onView(
            allOf(withId(R.id.btn_start), withText("START"), isDisplayed())
        )
        materialButton.perform(click())

        val button = onView(
            allOf(withId(R.id.btn_submit), withText("SUBMIT"), isDisplayed())
        )
        button.check(matches(isDisplayed()))
    }
}
