package com.example.seapp

object Setdata5 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata5>{
        var que5:ArrayList<Questiondata5> = arrayListOf()
        var q1=Questiondata5(
            question="You find some water from factory dumping lake, most appropiate way of this water cleaning is?",
            id=1,
            option_1="Boiling it",
            option_2="Chemical Purification",
            option_3="Reverse Osmosis",
            option_4="We can't clean such waters",
            correct_ans=2
        )

        var q2=Questiondata5(
            question="The best source of clean water from nature is ",
            id=2,
            option_1="Lakes",
            option_2="Rain",
            option_3="Ponds",
            option_4="Seas",
            correct_ans=2
        )



        var q3=Questiondata5(
            question="In what ways we can preserve rainwater",
            id=3,
            option_1="Groundpits",
            option_2="Water drums",
            option_3="Khadin Bund System",
            option_4="ALL these can",
            correct_ans=4
        )

        var q4=Questiondata5(
            question="What do you think how does clean water effect the mental health of human being?",
            id=4,
            option_1="Hydrated Body doesn't feel tired or stressed.",
            option_2="Bathing with clean water makes mind to be refreshed",
            option_3="Cleaning the surroundings does make mind good",
            option_4="Option 2 & 3",
            correct_ans=4
        )

        var q5=Questiondata5(
            question="Does the cleaning of water effects on climate?",
            id=5,
            option_1="Yes, because water bodies determine the climate change",
            option_2="No, water is not related to climate in anyway",
            option_3="Not always yes, cause some water bodies doesn't effect much",
            option_4="None of these are correct",
            correct_ans=1
        )
        que5.add(q1)
        que5.add(q2)
        que5.add(q3)
        que5.add(q4)
        que5.add(q5)
        return que5
    }
}