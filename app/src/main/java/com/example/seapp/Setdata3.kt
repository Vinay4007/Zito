package com.example.seapp

object Setdata3 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata3>{
        var que3:ArrayList<Questiondata3> = arrayListOf()
        var q1=Questiondata3(
            question="Who is pres of antar",
            id=1,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q2=Questiondata3(
            question="Who is pres of ameca",
            id=2,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )



        var q3=Questiondata3(
            question="Who is pres of asa",
            id=3,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=4
        )

        var q4=Questiondata3(
            question="Who is pres of eupe",
            id=4,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q5=Questiondata3(
            question="Who is pres of auralia",
            id=5,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )
        que3.add(q1)
        que3.add(q2)
        que3.add(q3)
        que3.add(q4)
        que3.add(q5)
        return que3
    }
}