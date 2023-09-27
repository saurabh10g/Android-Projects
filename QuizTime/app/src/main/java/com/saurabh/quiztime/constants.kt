package com.saurabh.quiztime

object constants {

    const val  User_Name :String ="user_name"
    const val Total_questions :String = "total_question"
    const val Correct_Answers : String ="correct_answer"


    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.uk,
            "Armenia","United States","United Kingdom","Australia",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.argentina,
            "Kuwait","Argentina","Japan","China",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.germany,
            "Egypt","Denmark","Brazil","Germany",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.france,
            "Greece","France","Italy","Austria",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.indonesia,
            "India","Guinea","Indonesia","Hungary",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.italy,
            "Italy","Germany","France","Russia",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.mexico,
            "Saudi Arabia","Mexico","Nepal","Ireland",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.russia,
            "Jamaica","Pakistan","Mexico","Russia",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.southkorea,
            "South Korea","North Korea","Maldives","Malaysia",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            id = 1,"What Country Does This flag belongs to?",
            R.drawable.turkey,
            "Myanmar","Turkey","China","Philippines",
            2
        )
        questionList.add(que10)

        return questionList
    }
}