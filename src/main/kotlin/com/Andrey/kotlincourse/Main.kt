package com.Andrey.com.Andrey.kotlincourse.leson3

val chassis: String = "4f56e"

var colour: String = "Blue"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by lazy {
    ""
}


var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }



