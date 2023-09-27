package com.saurabh.quiztime

object constants {

    const val  User_Name :String ="user_name"
    const val Total_questions :String = "total_question"
    const val Correct_Answers : String ="correct_answer"


    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

// Question 1 - China
        val que1 = Question(
            id = 1,
            "China",
            "Beijing", "Shanghai", "Tokyo", "Seoul",
            1
        )
        questionList.add(que1)

// Question 2 - India
        val que2 = Question(
            id = 2,
            "India",
            "Mumbai", "Delhi", "Bangkok", "Islamabad",
            2
        )
        questionList.add(que2)

// Question 3 - United States
        val que3 = Question(
            id = 3,
            "United States",
            "Washington, D.C.", "New York", "Los Angeles", "London",
            1
        )
        questionList.add(que3)

// Question 4 - Indonesia
        val que4 = Question(
            id = 4,
            "Indonesia",
            "Jakarta", "Manila", "Kuala Lumpur", "Singapore",
            1
        )
        questionList.add(que4)

// Question 5 - Pakistan
        val que5 = Question(
            id = 5,
            "Pakistan",
            "Karachi", "Lahore", "Islamabad", "Dhaka",
            3
        )
        questionList.add(que5)

// Question 6 - Brazil
        val que6 = Question(
            id = 6,
            "Brazil",
            "Brasília", "Rio de Janeiro", "Buenos Aires", "São Paulo",
            1
        )
        questionList.add(que6)

// Question 7 - Nigeria
        val que7 = Question(
            id = 7,
            "Nigeria",
            "Lagos", "Abuja", "Cairo", "Accra",
            2
        )
        questionList.add(que7)

// Question 8 - Bangladesh
        val que8 = Question(
            id = 8,
            "Bangladesh",
            "Dhaka", "Kolkata", "Colombo", "Kathmandu",
            1
        )
        questionList.add(que8)

// Question 9 - Russia
        val que9 = Question(
            id = 9,
            "Russia",
            "Moscow", "St. Petersburg", "Kiev", "Astana",
            1
        )
        questionList.add(que9)

// Question 10 - Mexico
        val que10 = Question(
            id = 10,
            "Mexico",
            "Mexico City", "Buenos Aires", "Madrid", "Santiago",
            1
        )
        questionList.add(que10)

// Question 11 - Japan
        val que11 = Question(
            id = 11,
            "Japan",
            "Tokyo", "Seoul", "Beijing", "Shanghai",
            1
        )
        questionList.add(que11)

// Question 12 - Ethiopia
        val que12 = Question(
            id = 12,
            "Ethiopia",
            "Addis Ababa", "Nairobi", "Cairo", "Khartoum",
            1
        )
        questionList.add(que12)

// Question 13 - Philippines
        val que13 = Question(
            id = 13,
            "Philippines",
            "Manila", "Jakarta", "Bangkok", "Kuala Lumpur",
            1
        )
        questionList.add(que13)

// Question 14 - Egypt
        val que14 = Question(
            id = 14,
            "Egypt",
            "Cairo", "Alexandria", "Riyadh", "Tunis",
            1
        )
        questionList.add(que14)

// Question 15 - Vietnam
        val que15 = Question(
            id = 15,
            "Vietnam",
            "Hanoi", "Ho Chi Minh City", "Bangkok", "Phnom Penh",
            1
        )
        questionList.add(que15)

// Question 16 - DR Congo (Democratic Republic of the Congo)
        val que16 = Question(
            id = 16,
            "DR Congo",
            "Kinshasa", "Nairobi", "Luanda", "Brazzaville",
            1
        )
        questionList.add(que16)

// Question 17 - Turkey
        val que17 = Question(
            id = 17,
            "Turkey",
            "Ankara", "Istanbul", "Athens", "Tehran",
            1
        )
        questionList.add(que17)

// Question 18 - Iran
        val que18 = Question(
            id = 18,
            "Iran",
            "Tehran", "Baghdad", "Riyadh", "Kabul",
            1
        )
        questionList.add(que18)

// Question 19 - Germany
        val que19 = Question(
            id = 19,
            "Germany",
            "Berlin", "Munich", "Vienna", "Bern",
            1
        )
        questionList.add(que19)

// Question 20 - Thailand
        val que20 = Question(
            id = 20,
            "Thailand",
            "Bangkok", "Hanoi", "Manila", "Kuala Lumpur",
            1
        )
        questionList.add(que20)

// Question 21 - United Kingdom
        val que21 = Question(
            id = 21,
            "United Kingdom",
            "London", "Dublin", "Edinburgh", "Cardiff",
            1
        )
        questionList.add(que21)

// Question 22 - France
        val que22 = Question(
            id = 22,
            "France",
            "Paris", "Berlin", "Madrid", "Rome",
            1
        )
        questionList.add(que22)

// Question 23 - Italy
        val que23 = Question(
            id = 23,
            "Italy",
            "Rome", "Milan", "Venice", "Madrid",
            1
        )
        questionList.add(que23)

// Question 24 - Tanzania
        val que24 = Question(
            id = 24,
            "Tanzania",
            "Dodoma", "Nairobi", "Kigali", "Lilongwe",
            1
        )
        questionList.add(que24)

// Question 25 - South Africa
        val que25 = Question(
            id = 25,
            "South Africa",
            "Pretoria", "Cape Town", "Nairobi", "Lusaka",
            1
        )
        questionList.add(que25)

// Question 26 - Myanmar (Burma)
        val que26 = Question(
            id = 26,
            "Myanmar",
            "Naypyidaw", "Bangkok", "Hanoi", "Phnom Penh",
            1
        )
        questionList.add(que26)

// Question 27 - Kenya
        val que27 = Question(
            id = 27,
            "Kenya",
            "Nairobi", "Kampala", "Dar es Salaam", "Lusaka",
            1
        )
        questionList.add(que27)

// Question 28 - South Korea
        val que28 = Question(
            id = 28,
            "South Korea",
            "Seoul", "Tokyo", "Beijing", "Pyongyang",
            1
        )
        questionList.add(que28)

// Question 29 - Colombia
        val que29 = Question(
            id = 29,
            "Colombia",
            "Bogotá", "Lima", "Quito", "Caracas",
            1
        )
        questionList.add(que29)

// Question 30 - Spain
        val que30 = Question(
            id = 30,
            "Spain",
            "Madrid", "Barcelona", "Lisbon", "Rome",
            1
        )
        questionList.add(que30)

        return questionList
    }
}


