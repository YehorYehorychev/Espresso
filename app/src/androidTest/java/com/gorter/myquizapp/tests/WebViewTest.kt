package com.gorter.myquizapp.tests

import android.preference.PreferenceActivity
import android.view.KeyEvent
import android.webkit.WebView
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.web.assertion.WebViewAssertions.webMatches
import androidx.test.espresso.web.sugar.Web.onWebView
import androidx.test.espresso.web.webdriver.DriverAtoms.*
import androidx.test.espresso.web.webdriver.Locator
import com.gorter.myquizapp.BaseTest
import com.gorter.myquizapp.R
import org.hamcrest.CoreMatchers.*
import org.junit.Test

/**
 * Contains tests for a [WebView] pages inside the TO-DO sample app.
 */
class WebViewTest : BaseTest() {

/*    @Test
    fun updatesLabelAndOpensNewPage() {
        onView(
            allOf(
                withId(R.id.design_menu_item_text),
                withText(R.string.settings_title)
            )
        ).perform(click())
        onData(instanceOf(PreferenceActivity.Header::class.java))
            .inAdapterView(withId(android.R.id.list))
            .atPosition(3)
            .perform(click())
        onWebView()
            .forceJavascriptEnabled()
            .withElement(findElement(Locator.ID, "text_input"))
            .perform(webKeys("Espresso WebView testing"))
            .withElement(findElement(Locator.ID, "submit_btn"))
            .perform(webClick())
            .withElement(findElement(Locator.ID, "response"))
            .check(webMatches(getText(), equalTo("Espresso+WebView+testing")))
    }

    @Test
    fun selectsRadioButtonWithCss() {
        onView(
            allOf(
                withId(R.id.design_menu_item_text),
                withText(R.string.settings_title)
            )
        ).perform(click())
        onData(instanceOf(PreferenceActivity.Header::class.java))
            .inAdapterView(withId(android.R.id.list))
            .atPosition(3)
            .perform(click())
        onWebView()
            .withElement(findElement(Locator.CSS_SELECTOR, "input[value=\"rb1\"]"))
            .perform(webClick())
    }

    @Test
    fun findsElementsByXpath() {
        onView(
            allOf(
                withId(R.id.design_menu_item_text),
                withText(R.string.settings_title)
            )
        ).perform(click())
        onData(instanceOf(PreferenceActivity.Header::class.java))
            .inAdapterView(withId(android.R.id.list))
            .atPosition(3)
            .perform(click())
        onWebView()
            .withElement(findElement(Locator.XPATH, "//label[@id=\"selection_result\"]"))
            .perform(webScrollIntoView())
            .check(webMatches(getText(), equalTo("Select option")))
    }

    @Test
    fun opensModal() {
        onView(
            allOf(
                withId(R.id.design_menu_item_text),
                withText(R.string.settings_title)
            )
        ).perform(click())
        onData(instanceOf(PreferenceActivity.Header::class.java))
            .inAdapterView(withId(android.R.id.list))
            .atPosition(3)
            .perform(click())
        onWebView()
            .withElement(findElement(Locator.ID, "updateDetails"))
            .perform(webClick())
            .withElement(findElement(Locator.ID, "modal_text_input"))
            .perform(webKeys("Text from modal"))
            .withElement(findElement(Locator.ID, "confirm"))
            .perform(webClick())
            .withElement(findElement(Locator.ID, "modal_message"))
            .check(webMatches(getText(), equalTo("Text from modal")))
    }

    @Test
    fun failsToClickSelectDropDown() {
        onView(
            allOf(
                withId(R.id.design_menu_item_text),
                withText(R.string.settings_title)
            )
        ).perform(click())
        onData(instanceOf(PreferenceActivity.Header::class.java))
            .inAdapterView(withId(android.R.id.list))
            .atPosition(3)
            .perform(click())
        onWebView()
            .withElement(findElement(Locator.ID, "selection_id"))
            .perform(webClick())
            .withElement(findElement(Locator.ID, "selection_result"))
            .check(webMatches(getText(), equalTo("Item 3")))
    }

    @Test
    fun verifiesSelectDropDown() {
        onView(
            allOf(
                withId(R.id.design_menu_item_text),
                withText(R.string.settings_title)
            )
        ).perform(click())
        onData(instanceOf(PreferenceActivity.Header::class.java))
            .inAdapterView(withId(android.R.id.list))
            .atPosition(3)
            .perform(click())
        onView(withId(R.id.web_view))
            .sleepAndPressKey(KeyEvent.KEYCODE_TAB, 500, 6)
            .pressKeyAndSleep(KeyEvent.KEYCODE_SPACE, 500)
        onView(allOf(withId(android.R.id.text1), withText("Item 3"))).perform(click())
        onWebView()
            .withElement(findElement(Locator.ID, "selection_result"))
            .check(webMatches(getText(), equalTo("Item 3")))
    }

    @Test
    fun showsOtherLocatorsSample() {
        onView(
            allOf(
                withId(R.id.design_menu_item_text),
                withText(R.string.settings_title)
            )
        ).perform(click())
        onData(instanceOf(PreferenceActivity.Header::class.java))
            .inAdapterView(withId(android.R.id.list))
            .atPosition(3)
            .perform(click())
        onWebView()
            .withElement(findElement(Locator.NAME, "text_input"))
            .perform(webScrollIntoView())
            .withElement(findElement(Locator.LINK_TEXT, "Espresso Web."))
            .perform(webScrollIntoView())
            .withElement(findElement(Locator.PARTIAL_LINK_TEXT, "Espresso"))
            .perform(webScrollIntoView())
            .withElement(findElement(Locator.CLASS_NAME, "header"))
            .check(webMatches(webScrollIntoView(), `is`(true)))
    }*/
}