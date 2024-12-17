package com.gorter.myquizapp.tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasLinks
import androidx.test.espresso.matcher.ViewMatchers.isClickable
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.gorter.myquizapp.BaseTest
import com.gorter.myquizapp.R
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.startsWith
import org.junit.Ignore
import org.junit.Test

class ViewAssertionsTest : BaseTest() {

    /**
     * doesNotExist() asserts that view does not exist in view hierarchy.
     * Don't mess it up with not(isDisplayed()).
     */
    @Test
    fun doesNotExistAssertion() {
        onView(withText("fake text")).check(doesNotExist())
    }

    /**
     * matches() ViewAssertion asserts that view with a given matcher exists in a view hierarchy.
     */
    @Ignore("Should fail because we have no links")
    @Test
    fun matchesAssertion() {
        onView(withText(R.id.btn_start)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_start)).check(matches(isClickable()))
        onView(allOf(withId(R.id.btn_start), withText(startsWith("STA"))))
            .check(matches(hasLinks()))
    }
}