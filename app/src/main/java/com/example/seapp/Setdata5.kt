package com.example.seapp

object Setdata5 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata5>{
        var que5:ArrayList<Questiondata5> = arrayListOf()
        var q1=Questiondata5(
            question="of antar",
            id=1,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q2=Questiondata5(
            question="of ameca",
            id=2,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )



        var q3=Questiondata5(
            question="of asa",
            id=3,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=4
        )

        var q4=Questiondata5(
            question="of eupe",
            id=4,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q5=Questiondata5(
            question="of auralia",
            id=5,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )
        que5.add(q1)
        que5.add(q2)
        que5.add(q3)
        que5.add(q4)
        que5.add(q5)
        return que5
    }
}