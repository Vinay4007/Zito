package com.example.seapp

object Setdata4 {


    const val score:String="score"

    fun getQuestion():ArrayList<Questiondata4>{
        var que4:ArrayList<Questiondata4> = arrayListOf()
        var q1=Questiondata4(
            question="Which can be followed to achieve sustainable development?",
            id=1,
            option_1="Restricting the usage of renewable resources",
            option_2="Controlling the growth rate of world’s population",
            option_3="Controlling the menace of pollution",
            option_4="All these",
            correct_ans=4
        )

        var q2=Questiondata4(
            question="What can happen when global warming increases?",
            id=2,
            option_1="Large scale deforestation",
            option_2="Rise in the sea levels",
            option_3="Rapid increase in the population across several countries",
            option_4="Huge amount of waste generation",
            correct_ans=2
        )



        var q3=Questiondata4(
            question="What is the main purpose of Central Pollution Control Board (CPCB)?",
            id=3,
            option_1="Regulate air Pollution",
            option_2="Regulate water Pollution",
            option_3="Regulate noise Pollution",
            option_4="Regulate Deforestation",
            correct_ans=1
        )

        var q4=Questiondata4(
            question="How does petting animals make human to feel an be healthy, like zoo or house petting?",
            id=4,
            option_1="by making social relations",
            option_2="Mental relief",
            option_3="Responsible",
            option_4="ALL these",
            correct_ans=3
        )

        var q5=Questiondata4(
            question="What you think about location of ozone layer?",
            id=5,
            option_1="in troposphere",
            option_2="in stratosphere",
            option_3="in exosphere",
            option_4="in mesosphere",
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