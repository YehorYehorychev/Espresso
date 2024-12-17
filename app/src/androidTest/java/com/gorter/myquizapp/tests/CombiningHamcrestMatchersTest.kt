package com.gorter.myquizapp.tests

import android.annotation.SuppressLint
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.gorter.myquizapp.BaseTest
import com.gorter.myquizapp.R
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.anyOf
import org.junit.Test

/**
 * Demonstrates [org.hamcrest] matchers that combine multiple matchers.
 */
class CombiningHamcrestMatchersTest : BaseTest() {

    /**
     * [CoreMatchers.allOf] matches an object when all of the specified matchers match.
     */
    @SuppressLint("CheckResult")
    @Test
    fun objectMatcherAllOf() {
        onView(
            allOf(
                withId(R.id.btn_start),
                withText("START")
            )
        )
    }

    /**
     * [CoreMatchers.anyOf] matches an object when any of the specified matchers match.
     */
    @SuppressLint("CheckResult")
    @Test
    fun objectMatcherAnyOf() {
        onView(
            anyOf(
                instanceOf(FloatingActionButton::class.java),
                withId(R.id.tv_title)
            )
        )
    }
}