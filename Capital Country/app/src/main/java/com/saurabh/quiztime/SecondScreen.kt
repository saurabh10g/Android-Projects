package com.saurabh.quiztime

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class SecondScreen : AppCompatActivity(),View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPositon: Int = 0

    private var mUserName:String? = null
    private var mCorrectAnswers : Int =0


    private var progressBar: ProgressBar? = null
    private var tv_progress: TextView? = null
    private var tvQuestion: TextView? = null
//    private var ivImage: ImageView? = null

    private var tvOption1: TextView? = null
    private var tvOption2: TextView? = null
    private var tvOption3: TextView? = null
    private var tvOption4: TextView? = null

    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        mUserName = intent.getStringExtra(constants.User_Name)

        progressBar = findViewById(R.id.progressBar)
        tv_progress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
//        ivImage = findViewById(R.id.iv_image)
        tvOption1 = findViewById(R.id.option1)
        tvOption2 = findViewById(R.id.option2)
        tvOption3 = findViewById(R.id.option3)
        tvOption4 = findViewById(R.id.option4)
        btnSubmit = findViewById((R.id.btn_submit))

        tvOption1?.setOnClickListener(this)
        tvOption2?.setOnClickListener(this)
        tvOption3?.setOnClickListener(this)
        tvOption4?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        mQuestionsList = constants.getQuestions()

        setQuestion()
    }

    private fun setQuestion() {

        defaultOptionsView()
        val que: Question = mQuestionsList!![mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        tv_progress?.text = "$mCurrentPosition/${progressBar?.max}"
        tvOption1?.text = que.option1
        tvOption2?.text = que.option2
        tvOption3?.text = que.option3
        tvOption4?.text = que.option4

        if (mCurrentPosition == mQuestionsList!!.size) {
            btnSubmit?.text = "FINISH"
        } else {
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()

        tvOption1?.let {
            options.add(0, it)
        }
        tvOption2?.let {
            options.add(1, it)
        }
        tvOption3?.let {
            options.add(2, it)
        }
        tvOption4?.let {
            options.add(3, it)
        }

        for (i in options) {
            i.setTextColor(Color.parseColor("#7A8089"))
            i.typeface = Typeface.DEFAULT
            i.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionview(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()

        mSelectedOptionPositon = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_bg
        )
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.option1 -> {
                tvOption1?.let {
                    selectedOptionview(it, 1)
                }
            }
            R.id.option2 -> {
                tvOption2?.let {
                    selectedOptionview(it, 2)
                }
            }
            R.id.option3 -> {
                tvOption3?.let {
                    selectedOptionview(it, 3)
                }
            }
            R.id.option4 -> {
                tvOption4?.let {
                    selectedOptionview(it, 4)
                }
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPositon == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent =Intent(this,ResultActivity::class.java)
                            intent.putExtra(constants.User_Name,mUserName)
                            intent.putExtra(constants.Correct_Answers,mCorrectAnswers)
                            intent.putExtra(constants.Total_questions,mQuestionsList?.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.coerrectAnswer != mSelectedOptionPositon) {
                        answerView(mSelectedOptionPositon, R.drawable.wrong_option_border_bg)
                    }
                    else
                    {
                        mCorrectAnswers++
                    }
                    answerView(question.coerrectAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size)
                    {
                        btnSubmit?.text ="FINISH"
                    }
                    else
                    {
                        btnSubmit?.text ="GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPositon=0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int)
    {
        when (answer)
        {
            1 -> {
                tvOption1?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 -> {
                tvOption2?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3 -> {
                tvOption3?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4 -> {
                tvOption4?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }
    }
}
