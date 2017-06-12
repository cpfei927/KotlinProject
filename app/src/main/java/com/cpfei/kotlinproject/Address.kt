package com.cpfei.kotlinproject

import android.text.TextUtils

/**
 * Created by cpfei on 2017/6/12.
 */
class Address {
    var name: String = ""

    var age: Int = 0

    var state: String? = null


    val isEmpty: Boolean
        get() = true


    var stringRepresentation: String
        get() = name
        set(value){
            stringRepresentation = name
        }


}