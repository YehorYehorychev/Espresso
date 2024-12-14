package com.gorter.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Australia",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_australia,
            optionOne = "Argentina",
            optionTwo = "Australia",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = 2
        )
        questionsList.add(que2)

        val que3 = Question(
            id = 3,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_belgium,
            optionOne = "Argentina",
            optionTwo = "France",
            optionThree = "Germany",
            optionFour = "Belgium",
            correctAnswer = 4
        )
        questionsList.add(que3)

        val que4 = Question(
            id = 4,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_brazil,
            optionOne = "Argentina",
            optionTwo = "Peru",
            optionThree = "Brazil",
            optionFour = "Belgium",
            correctAnswer = 3
        )
        questionsList.add(que4)

        val que5 = Question(
            id = 5,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_denmark,
            optionOne = "Norway",
            optionTwo = "Denmark",
            optionThree = "Germany",
            optionFour = "Belgium",
            correctAnswer = 2
        )
        questionsList.add(que5)

        val que6 = Question(
            id = 6,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_fiji,
            optionOne = "Argentina",
            optionTwo = "Fiji",
            optionThree = "Australia",
            optionFour = "New Zealand",
            correctAnswer = 2
        )
        questionsList.add(que6)

        val que7 = Question(
            id = 7,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_germany,
            optionOne = "Argentina",
            optionTwo = "France",
            optionThree = "Germany",
            optionFour = "Belgium",
            correctAnswer = 3
        )
        questionsList.add(que7)

        val que8 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_india,
            optionOne = "India",
            optionTwo = "Pakistan",
            optionThree = "Argentina",
            optionFour = "Netherlands",
            correctAnswer = 1
        )
        questionsList.add(que8)

        val que9 = Question(
            id = 9,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_kuwait,
            optionOne = "Irak",
            optionTwo = "South Africa",
            optionThree = "Jamaica",
            optionFour = "Kuwait",
            correctAnswer = 4
        )
        questionsList.add(que9)

        val que10 = Question(
            id = 10,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_new_zealand,
            optionOne = "Australia",
            optionTwo = "United Kingdom",
            optionThree = "New Zealand",
            optionFour = "Fiji",
            correctAnswer = 3
        )
        questionsList.add(que10)

        return questionsList
    }



}