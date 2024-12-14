package com.gorter.myquizapp.robots
import com.gorter.myquizapp.R

fun result(func: ResultRobot.() -> Unit) =
    ResultRobot().apply { func() }
class ResultRobot: BaseTestRobot() {

    fun isOnResultScreen(){
        viewWithIdIsDisplayed(R.id.tv_result)
    }

    fun resultIsXOutOfTen(result: Int){
        val text = "Your score is $result out of 10"
        textIsDisplayed(text)
    }

    fun nameIsShown(name: String){
        textIsDisplayed(name)
    }

}