//package com.gorter.myquizapp.screenshotTests
//
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.filters.SmallTest
//import androidx.test.rule.ActivityTestRule
//import com.gorter.myquizapp.QuizQuestionsActivity
//import com.karumi.shot.ScreenshotTest
//import org.junit.Before
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//
//
//@RunWith(AndroidJUnit4::class)
//class QuizQuestionsScreenshotTest: ScreenshotTest {
//
//    @get:Rule
//    var activityScenarioRule = ActivityTestRule<QuizQuestionsActivity>(
//        QuizQuestionsActivity::class.java, false, false)
//
//    @Before
//    fun setup() {
//        activityScenarioRule.launchActivity(null)
//    }
//
//
//    @Test
//    @SmallTest
//    fun quizQuestionsActivityIsShown() {
//        val activity = activityScenarioRule.activity
//
//        compareScreenshot(activity)
//    }
//}