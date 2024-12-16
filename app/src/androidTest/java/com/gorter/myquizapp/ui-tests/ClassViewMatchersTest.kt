package com.gorter.myquizapp.`ui-tests`

import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.junit.Test
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.matcher.ViewMatchers
import android.view.View
import com.gorter.myquizapp.BaseTest
import org.hamcrest.CoreMatchers.equalTo

/**
 * Demonstrates Espresso Class matchers.
 */
class ClassViewMatchersTest : BaseTest() {

    /**
     * [ViewMatchers.isAssignableFrom] matches a [View] based on its class.
     */
    @Test
    fun classIsAssignableFrom() {
        onView(isAssignableFrom(FloatingActionButton::class.java))
    }

    /**
     * [ViewMatchers.withClassName] matches a [View] based on its class name.
     */
    @Test
    fun classWithClassName() {
        onView(withClassName(equalTo(FloatingActionButton::class.java.name)))
    }
}