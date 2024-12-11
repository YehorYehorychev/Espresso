package com.example.todoapp.test.essentials.lesson_12_test_annotations

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import androidx.test.filters.MediumTest
import androidx.test.filters.SmallTest
import com.example.android.architecture.blueprints.todoapp.R
import com.example.todoapp.test.essentials.BaseTest
import org.junit.Test

class AnnotationsTest: BaseTest() {

    @SmallTest
    @Test
    fun textViewActionsTypeText() {
        onView(withId(R.id.fab_add_task)).perform(click())

        // typeText() ViewAction
        onView(withId(R.id.add_task_title))
            .perform(typeText("item 1"), closeSoftKeyboard())

        onView(withId(R.id.add_task_description))
            .perform(typeText("description 1"), closeSoftKeyboard())

        onView(withId(R.id.fab_edit_task_done)).perform(click())
    }

    @MediumTest
    @Test
    fun textViewActionsClearText() {
        onView(withId(R.id.fab_add_task)).perform(click())
        onView(withId(R.id.add_task_title))
            .perform(typeText("item 1"), closeSoftKeyboard())
        onView(withId(R.id.add_task_description))
            .perform(typeText("description 1"), closeSoftKeyboard())
        onView(withId(R.id.fab_edit_task_done)).perform(click())
        onView(withText("item 1")).perform(click())
        onView(withId(R.id.fab_edit_task)).perform(click())

        // clearText() ViewAction
        onView(withId(R.id.add_task_title)).perform(clearText())
    }

    @LargeTest
    @Test
    fun textViewActionsTypeTextIntoFocusedView() {
        onView(withId(R.id.fab_add_task)).perform(click())
        onView(withId(R.id.add_task_title))
            .perform(typeText("item 1"), closeSoftKeyboard())
        onView(withId(R.id.add_task_description))
            .perform(typeText("description 1"), closeSoftKeyboard())
        onView(withId(R.id.fab_edit_task_done)).perform(click())
        onView(withText("item 1")).perform(click())
        onView(withId(R.id.fab_edit_task)).perform(click())

        // typeTextIntoFocusedView() ViewAction
        onView(withId(R.id.add_task_title))
            .perform(clearText(), typeTextIntoFocusedView("edited item 1"))
    }

    @SmallTest
    @MediumTest
    @LargeTest
    @Test
    fun textViewActionsReplaceText() {
        onView(withId(R.id.fab_add_task)).perform(click())
        onView(withId(R.id.add_task_title))
            .perform(typeText("item 1"), closeSoftKeyboard())
        onView(withId(R.id.add_task_description))
            .perform(typeText("description 1"), closeSoftKeyboard())
        onView(withId(R.id.fab_edit_task_done)).perform(click())
        onView(withText("item 1")).perform(click())
        onView(withId(R.id.fab_edit_task)).perform(click())
        onView(withId(R.id.add_task_title))
            .perform(clearText(), typeTextIntoFocusedView("edited item 1"))

        // replaceText() ViewAction
        onView(withId(R.id.add_task_description))
            .perform(replaceText("edited description 1"))
        onView(withId(R.id.fab_edit_task_done)).perform(click())
    }
}