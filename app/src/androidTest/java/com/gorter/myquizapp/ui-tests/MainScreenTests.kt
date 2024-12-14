package com.gorter.myquizapp.`ui-tests`

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isClickable
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.gorter.myquizapp.R
import com.gorter.myquizapp.BaseTest
import org.junit.Test

class MainScreenTests : BaseTest() {

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