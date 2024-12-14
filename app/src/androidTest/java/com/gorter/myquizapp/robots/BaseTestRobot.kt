package com.gorter.myquizapp.robots

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

open class BaseTestRobot {

    fun enterTextOnViewWithId(@IdRes viewId: Int, text: String) {
        onView(withId(viewId)).perform(ViewActions.typeText(text))
        closeSoftKeyboard()
    }

    fun clickViewWithId(@IdRes viewId: Int) {
        onView(withId(viewId))
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun viewWithIdIsDisplayed(@IdRes viewId: Int) {
        onView(withId(viewId))
            .check(matches(isDisplayed()))
    }

    fun textIsDisplayed(text: String) {
        onView(withText(text))
    }

}