package com.gorter.myquizapp.`ui-tests`

import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.hasContentDescription
import androidx.test.espresso.matcher.ViewMatchers.hasLinks
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withSpinnerText
import androidx.test.espresso.matcher.ViewMatchers.withTagKey
import androidx.test.espresso.matcher.ViewMatchers.withTagValue
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.gorter.myquizapp.BaseTest
import com.gorter.myquizapp.R
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.nullValue
import org.junit.Ignore
import org.junit.Test

/**
 * Demonstrates Espresso User properties matchers.
 */
class UserPropertiesViewMatchersTest : BaseTest() {

    /**
     * [ViewMatchers.withId] matches a [View] based on id.
     */
    @Test
    fun userPropertiesWithId() {
        onView(withId(R.id.tv_title))
    }

    /**
     * [ViewMatchers.withText] matches a [View] based on text.
     */
    @Test
    fun userPropertiesWithText() {
        onView(withText("Quiz App!"))
        onView(withText(R.string.app_name))
    }

    /**
     * [ViewMatchers.withTagKey] matches a [View] based on tag key.
     */
    @Ignore("We don't have tags in our App")
    @Test
    fun userPropertiesWithTagKey() {
        onView(withTagKey(R.string.app_name))
    }

    /**
     * [ViewMatchers.withTagValue] matches a [View] based on tag value.
     */
    @Ignore("We don't have tags in our App")
    @Test
    fun userPropertiesWithTagValue() {
        onView(withTagValue(`is`("Title")))
    }

    /**
     * [ViewMatchers.hasContentDescription] matches a [View] based on existence of content description.
     */
    @Ignore("We don't have long press content descriptions in our App")
    @Test
    fun userPropertiesHasContentDescriptions() {
        onView(hasContentDescription())
    }

    /**
     * [ViewMatchers.withContentDescription] matches a [View] with given content description.
     */
    @Ignore("We don't have long press content descriptions in our App")
    @Test
    fun userPropertiesWithContentDescription() {
        onView(withContentDescription("Filter"))
        onView(withContentDescription(R.string.app_name))
    }

    /**
     * [ViewMatchers.withHint] matches a [View] with specified hint text.
     */
    @Test
    fun userPropertiesWithHint() {
        onView(withHint("e.g. John"))
        onView(withHint(R.string.app_name))
        onView(withHint(nullValue(String::class.java)))
    }

    /**
     * [ViewMatchers.withSpinnerText] matches a [Spinner] based on selected item.
     */
    @Ignore("The spinner text does not exist in our App")
    @Test
    fun userPropertiesWithSpinnerText() {
        onView(withSpinnerText("Fake spinner text"))
        onView(withSpinnerText(R.string.app_name))
    }

    /**
     * [ViewMatchers.hasLinks] matches a [TextView] that has links.
     */
    @Ignore("We don't have links in the main screen of our app")
    @Test
    fun userPropertiesHasLinks() {
        onView(hasLinks())
    }
}