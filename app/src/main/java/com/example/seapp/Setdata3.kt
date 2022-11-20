package com.example.seapp

object Setdata3 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata3>{
        var que3:ArrayList<Questiondata3> = arrayListOf()
        var q1=Questiondata3(
            question="Which of the following are real illnesses? Briefly think about it",
            id=1,
            option_1=" Diabetes",
            option_2="Anxiety (worrying a lot) ",
            option_3="Flu",
            option_4="All these",
            correct_ans=4
        )

        var q2=Questiondata3(
            question="Which of these symptoms can happen if you’re depressed?",
            id=2,
            option_1="Don’t feel hungry ",
            option_2="Hungry all the time",
            option_3="Always tired",
            option_4="ALL these",
            correct_ans=4
        )



        var q3=Questiondata3(
            question="Depression level in children is less than as compared to man ? what is their normal ratio ?",
            id=3,
            option_1="10 : 25",
            option_2="10 : 50",
            option_3="20 : 30",
            option_4="None",
            correct_ans=1
        )

        var q4=Questiondata3(
            question="Who is the most affected by mental health issues?",
            id=4,
            option_1="12-17 years old",
            option_2="18-25 years old",
            option_3="26-35 years old",
            option_4="above 35 years old",
            correct_ans=3
        )

        var q5=Questiondata3(
            question="______________ disorders are illnesses that affect the mind and reduces a person's ability to function",
            id=5,
            option_1="Social",
            option_2="Eating",
            option_3="Mental",
            option_4="Physical",
            correct_ans=3
        )
        que3.add(q1)
        que3.add(q2)
        que3.add(q3)
        que3.add(q4)
        que3.add(q5)
        return que3
    }
}