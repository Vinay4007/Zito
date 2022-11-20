package com.example.seapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_level1_q1.*
import kotlin.math.log10

class Level1Q1 : AppCompatActivity() {


    private var score:Int=0
    private var currentPosition:Int=1
    private var questionList:ArrayList<Questiondata>?=null
    private var selected_option:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1_q1)


        questionList=Setdata.getQuestion()

        setQuestion()
         l1op1.setOnClickListener{
             selectedOptionStyle(l1op1,1)
         }
        l1op2.setOnClickListener{
            selectedOptionStyle(l1op2,2)
        }
        l1op3.setOnClickListener{
            selectedOptionStyle(l1op3,3)
        }
        l1op4.setOnClickListener{
            selectedOptionStyle(l1op4,4)
        }

        submit.setOnClickListener {
            if(selected_option!=0)
            {
                val question=questionList!![currentPosition-1]
                if(selected_option==question.correct_ans)
                {
                    score++;

                }
//                setColor(question.correct_ans,R.drawable.correctoption)
                if(currentPosition==questionList!!.size)
                {
                    submit.text="LEVEL COMPLETED"
                }
            }
//            else
//            {
                currentPosition++
                when{
                    currentPosition<=questionList!!.size->{
                        setQuestion()
                    }
                    else->{
                       var intent = Intent(this,Level1Result::class.java)
//                        intent.putExtra(Setdata.name,Name.toString())
                        intent.putExtra(Setdata.score,score.toString())
                        intent.putExtra("total size",questionList!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
//                }
            }
//            selected_option=0
        }
//        Setdata.getQuestion()
//        questionList=Setdata.getQuestion()
//
//        var que=questionList!![0]
//        l1q1.text=que.question
//        l1op1.text=que.option_1
//        l1op2.text=que.option_2
//        l1op3.text=que.option_3
//        l1op4.text=que.option_4
//
//        p1l1.progress=1
//
//        p1l1.max=questionList!!.size
//        var demo=Setdata.getQuestion()
//        val tag="my test"
//        val msg="${demo.size}"
//        Log.e(tag,msg)

    }

    fun setColor(opt:Int,color:Int){
      when(opt){
          1->{
              l1op1.background=ContextCompat.getDrawable(this,color)
          }
          2->{
              l1op2.background=ContextCompat.getDrawable(this,color)
          }
          3->{
              l1op3.background=ContextCompat.getDrawable(this,color)
          }
          4->{
              l1op4.background=ContextCompat.getDrawable(this,color)
          }
      }
    }
    fun setQuestion(){
        val question = questionList!![currentPosition-1]

        setOptionStyle()
        p1l1.progress=currentPosition
        p1l1.max=questionList!!.size
        p1l1t1.text="${currentPosition}"+"/"+"${questionList!!.size}"
        l1q1.text=question.question
        l1op1.text=question.option_1
        l1op2.text=question.option_2
        l1op3.text=question.option_3
        l1op4.text=question.option_4

    }

    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,l1op1)
        optionList.add(0,l1op2)
        optionList.add(0,l1op3)
        optionList.add(0,l1op4)

        for(op in optionList){
            op.setTextColor(Color.parseColor("#0B0808"))
            op.background=ContextCompat.getDrawable(this,R.drawable.question_option)
            op.typeface= Typeface.DEFAULT
        }
    }

    fun selectedOptionStyle(view:TextView,opt:Int){

        setOptionStyle()
        selected_option=opt
        view.background=ContextCompat.getDrawable(this,R.drawable.selected_option)
        view.typeface=Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }
}