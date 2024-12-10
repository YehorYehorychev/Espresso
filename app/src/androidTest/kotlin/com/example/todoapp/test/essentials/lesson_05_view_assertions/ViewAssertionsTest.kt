package com.example.todoapp.test.essentials.lesson_05_view_assertions

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasLinks
import androidx.test.espresso.matcher.ViewMatchers.isClickable
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.android.architecture.blueprints.todoapp.R
import com.example.todoapp.test.essentials.BaseTest
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.startsWith
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
     * matches() V       - https://dl.google.com/dl/android/maven2/com/azimolabs/conditionwatcher/conditionwatcher/0.2/conditionwatcher-0.2.pom
     *      Required by:
     *          project :app
     *
     * * Try:
     * > Run with --stacktrace option to get the stack trace.
     * > Run with --info or --debug option to get more log output.
     * > Run with --scan to get full insights.
     * ==============================================================================
     *
     * * Get more help at https://help.gradle.org
     *
     * BUILD FAILED in 4s
     * 46 actionable tasks: 7 executed, 39 up-to-dateiewAssertion asserts that view with a given matcher exists in a view hierarchy.
     */
    @Test
    fun matchesAssertion() {
        onView(withText(R.string.no_tasks_all)).check(matches(isDisplayed()))
        onView(withId(R.id.fab_add_task)).check(matches(isClickable()))
        onView(allOf(withId(R.id.myWebPage), withText(startsWith("Visit my page:"))))
            .check(matches(hasLinks()))
    }

    @Test
    fun verifyActiveTasksText() {
        onView(withId(R.id.statistics))
            .check(matches(withText("Active tasks: 1")))
    }
}
