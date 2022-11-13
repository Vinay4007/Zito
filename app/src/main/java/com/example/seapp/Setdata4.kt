package com.example.seapp

object Setdata4 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata4>{
        var que4:ArrayList<Questiondata4> = arrayListOf()
        var q1=Questiondata4(
            question="Whopres of antar",
            id=1,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q2=Questiondata4(
            question="Whopres of ameca",
            id=2,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )



        var q3=Questiondata4(
            question="Whopres of asa",
            id=3,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=4
        )

        var q4=Questiondata4(
            question="Whopres of eupe",
            id=4,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=3
        )

        var q5=Questiondata4(
            question="Whopres of auralia",
            id=5,
            option_1="Trump",
            option_2="putin",
            option_3="Modi",
            option_4="Xi Jing Ping",
            correct_ans=2
        )
        que4.add(q1)
        que4.add(q2)
        que4.add(q3)
        que4.add(q4)
        que4.add(q5)
        return que4
    }
}