package com.example.seapp

object Setdata2 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata2>{
        var que2:ArrayList<Questiondata2> = arrayListOf()
        var q1=Questiondata2(
            question="Who is president of antar",
            id=1,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q2=Questiondata2(
            question="Who is president of ameca",
            id=2,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )



        var q3=Questiondata2(
            question="Who is president of asa",
            id=3,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=4
        )

        var q4=Questiondata2(
            question="Who is president of eupe",
            id=4,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q5=Questiondata2(
            question="Who is president of auralia",
            id=5,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )
        que2.add(q1)
        que2.add(q2)
        que2.add(q3)
        que2.add(q4)
        que2.add(q5)
        return que2
    }
}