//package com.gorter.myquizapp.screenshotTests
//
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.filters.SmallTest
//import androidx.test.rule.ActivityTestRule
//import com.gorter.myquizapp.MainActivity
//import com.karumi.shot.ScreenshotTest
//import org.junit.Before
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//
//
//@RunWith(AndroidJUnit4::class)
//class MainActivityScreenshotTest: ScreenshotTest {
//
//    @get:Rule
//    var activityScenarioRule = ActivityTestRule<MainActivity>(
//        MainActivity::class.java, false, false)
//
//    @Before
//    fun setup() {
//        activityScenarioRule.launchActivity(null)
//    }
//
//
//    @Test
//    @SmallTest
//    fun mainActivityIsShown() {
//        val activity = activityScenarioRule.activity
//
//        compareScreenshot(activity)
//    }
//}