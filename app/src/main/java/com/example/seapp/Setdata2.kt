package com.example.seapp

object Setdata2 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata2>{
        var que2:ArrayList<Questiondata2> = arrayListOf()
        var q1=Questiondata2(
            question="Which one of the following Health and wellbeing lifestyle determinants, an individual has the maximum control ?",
            id=1,
            option_1="Healthcare system",
            option_2="Social and cultural ",
            option_3="Heredity and age",
            option_4="Personal Interactions",
            correct_ans=4
        )

        var q2=Questiondata2(
            question="Which of the following is not a component of 'skill-related physical fitness' ?",
            id=2,
            option_1="Agility",
            option_2="Muscular Strength",
            option_3="Coordination",
            option_4="Reaction time",
            correct_ans=2
        )



        var q3=Questiondata2(
            question="Environmental psychologists emphasize the importance of taking which of the following into consideration when examining behaviour?",
            id=3,
            option_1="Genetics",
            option_2="Brain structure",
            option_3="Physical and social context",
            option_4="None",
            correct_ans=3
        )

        var q4=Questiondata2(
            question="Which of the following are considered as the Social Inheritance of Man?",
            id=4,
            option_1="Traditions ",
            option_2="Habits",
            option_3="Conditional reflexes ",
            option_4="Religious practices",
            correct_ans=3
        )

        var q5=Questiondata2(
            question="To help keep you on track with physical activity, it's important to.........",
            id=5,
            option_1="set an activity goal",
            option_2="get the correct shoes and clothes",
            option_3="Create an activity calendar",
            option_4="All of the above",
            correct_ans=4
        )
        que2.add(q1)
        que2.add(q2)
        que2.add(q3)
        que2.add(q4)
        que2.add(q5)
        return que2
    }
}