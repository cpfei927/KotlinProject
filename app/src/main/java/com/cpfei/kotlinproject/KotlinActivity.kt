package com.cpfei.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)


        kotlinImg.setImageResource(R.mipmap.kotlin)


        kotlinTxtv.text = "My is First Kotlin"


    }
}
