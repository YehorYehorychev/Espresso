package com.gorter.myquizapp.screenTests

import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.gorter.myquizapp.MainActivity
import com.gorter.myquizapp.robots.main
import com.gorter.myquizapp.robots.quizQuestions
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityScreenTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    @LargeTest
    fun titleIsShown() {
        main {
            titleIsShown()
        }
    }

    @Test
    @LargeTest
    fun canEnterNameAndSeeNextScreen() {
        main {
            enterName("Robert")
            pressStart()
        }
        quizQuestions {
            isOnQuestionsScreen()
        }
    }
}