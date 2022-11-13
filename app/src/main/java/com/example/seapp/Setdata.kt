package com.example.seapp

object Setdata {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<Questiondata>{
       var que:ArrayList<Questiondata> = arrayListOf()
       var q1=Questiondata(
           question="Who is president of antarctica",
           id=1,
           option_1="Trump",
           option_2="putin",
           option_3="Modi",
           option_4="Xi Jing Ping",
       correct_ans=3
       )

       var q2=Questiondata(
           question="Who is president of america",
           id=2,
           option_1="Trump",
           option_2="putin",
           option_3="Modi",
           option_4="Xi Jing Ping",
           correct_ans=2
       )



       var q3=Questiondata(
           question="Who is president of asia",
           id=3,
           option_1="Trump",
           option_2="putin",
           option_3="Modi",
           option_4="Xi Jing Ping",
           correct_ans=4
       )

       var q4=Questiondata(
           question="Who is president of europe",
           id=4,
           option_1="Trump",
           option_2="putin",
           option_3="Modi",
           option_4="Xi Jing Ping",
           correct_ans=3
       )

       var q5=Questiondata(
           question="Who is president of australia",
           id=5,
           option_1="Trump",
           option_2="putin",
           option_3="Modi",
           option_4="Xi Jing Ping",
           correct_ans=2
       )
       que.add(q1)
       que.add(q2)
       que.add(q3)
       que.add(q4)
       que.add(q5)
       return que
   }
}