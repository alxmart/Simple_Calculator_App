package com.androidatc.simplecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = et_Number1.text
        val n2 = et_Number2.text

        btn_plus.setOnClickListener {
            val sumResult = n1.toString().toDouble() +
                            n2.toString().toDouble()
            tv_result_view.text = sumResult.toString()
        }

        btn_minus.setOnClickListener {
            val sumResult = n1.toString().toDouble() -
                    n2.toString().toDouble()
            tv_result_view.text = sumResult.toString()
        }

        btn_multiply.setOnClickListener {
            val sumResult = n1.toString().toDouble() *
                    n2.toString().toDouble()
            tv_result_view.text = sumResult.toString()
        }

        btn_divide.setOnClickListener {
            val sumResult = n1.toString().toDouble() /
                    n2.toString().toDouble()
            tv_result_view.text = sumResult.toString()
        }


    }
}