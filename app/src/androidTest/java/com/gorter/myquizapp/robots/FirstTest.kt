package com.gorter.myquizapp.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isClickable
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gorter.myquizapp.MainActivity
import com.gorter.myquizapp.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FirstTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun welcomeScreenAssertionTest() {
        onView(withText("Welcome!"))
            .check(matches(isDisplayed()))
        onView(withText("Please enter your name"))
            .check(matches(isDisplayed()))
            .check(matches(isDisplayed()))
    }

    @Test
    fun welcomeScreenAssertionTest2() {
        onView(withId(R.id.et_name))
            .check(matches(isClickable()))
    }
}