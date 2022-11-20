package com.example.seapp

object Setdata {

    const val score:String="score"

   fun getQuestion():ArrayList<Questiondata>{
       var que:ArrayList<Questiondata> = arrayListOf()
       var q1=Questiondata(
           question="Which of the following diet is best or most preferred?",
           id=1,
           option_1="1kg of chicken per day(2300cal)",
           option_2="800g of cheese per day(2400cal)",
           option_3="500g of rice,500g of fish,600g of egg per day(2200cal)",
           option_4="300g of rice,300g of chicken,300g of fish,200g of milk,200g of corn,100g of mushroom,100g of carrot,tomato,Spinach,50g of fish(2500cal)",
           correct_ans=4
       )

       var q2=Questiondata(
           question="Some of your classmates can't see the blackboard from the backbench if you don't want that kind of problem which is the best food to eat daily?",
           id=2,
           option_1="Mushroom",
           option_2="Egg",
           option_3="Carrot",
           option_4="Chicken",
           correct_ans=3



       )



       var q3=Questiondata(
           question=" If your friend gave you  a challenge to defeat him/her in armwrestling after two months.What should you eat in these two months to defeat him/her at that time?",
           id=3,
           option_1="Eating potatoes everyday",
           option_2="Eating Spinach,tomato everyday",
           option_3="Eating chicken,fish,eggs everyday",
           option_4="Eating Onions,corn everyday ",
           correct_ans=3
       )

       var q4=Questiondata(
           question="Your friend is not able to eat properly as there are patches in gums which results in burning sensation, bleeding.What do you suggest him/her to eat to cure his problem ?",
           id=4,
           option_1="Mushrooms",
           option_2="Fish",
           option_3="Onions, Potatoes, Cheese",
           option_4="Lemon, Oranges",
           correct_ans=4
       )

       var q5=Questiondata(
           question="One of your friend is obese and is suffering from it.What diet will you recommend to reduce obesity?",
           id=5,
           option_1="100 cal  food in morning, 600 cal  food  in afternoon 1400 cal food in night",
           option_2="300 cal food in morning,800 cal food in afternoon, 1000 cal food in night",
           option_3="600 cal food in morning,700 cal food in afternoon, 800 cal food in night",
           option_4="1000 cal food in morning,600 cal food in afternoon ,500 cal food in night",
           correct_ans=4
       )
       que.add(q1)
       que.add(q2)
       que.add(q3)
       que.add(q4)
       que.add(q5)
       return que
   }
}