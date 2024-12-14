package com.gorter.myquizapp.devicesetup

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.gorter.myquizapp.BaseTest
import com.gorter.myquizapp.R
import org.junit.Before
import org.junit.Test

/**
 * Demonstrates how to set device in test-friendly state to reduce test flakiness.
 */
class DeviceSetupTest : BaseTest() {

    /**
     * Set of shell commands that should be run before test
     * which turn off System animations, increase Accessibility Touch & hold delay
     * and disable Virtual keyboard appearance.
     */
    @Before
    fun setDevicePreferences() {
        val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

        // System animation properties.
        uiDevice.executeShellCommand("settings put global animator_duration_scale 0")
        uiDevice.executeShellCommand("settings put global transition_animation_scale 0")
        uiDevice.executeShellCommand("settings put global window_animation_scale 0")

        // Touch & hold delay property.
        uiDevice.executeShellCommand("settings put secure long_press_timeout 2500")

        // Virtual keyboard appearance property.
        uiDevice.executeShellCommand("settings put secure show_ime_with_hard_keyboard 0")
    }

    @Test
    fun clicksAddTaskButton() {
        onView(withId(R.id.et_name)).perform(click())
    }
}