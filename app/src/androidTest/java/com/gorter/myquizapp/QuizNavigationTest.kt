package com.gorter.myquizapp

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gorter.myquizapp.robots.main
import com.gorter.myquizapp.robots.quizQuestions
import com.gorter.myquizapp.robots.result
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class QuizNavigationTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun canNavigateAppToResults() {
        val name = "Robert"
        main {
            titleIsShown()
            enterName(name)
            pressStart()
        }
        quizQuestions {
            isOnQuestionsScreen()
            answerAllCorrectly()
        }
        result {
            isOnResultScreen()
            nameIsShown(name)
            resultIsXOutOfTen(10)
        }
    }
}