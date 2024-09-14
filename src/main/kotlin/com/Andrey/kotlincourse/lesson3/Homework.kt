package com.Andrey.kotlincourse.lesson3

val name: String = "Hackathon Survival"

var date: String = "15.04.2025"

val place: String = "St.Petersburg, Malaya Morskaya st., 10 "

val budget: String = "250000"

var participants: Int = 0
    get() = field
    private set(value) {field=value}

var duration: Long = 12*60*60

private lateinit var contactinformation: String

var status: String = "not started"

val notstarted: String = "list of sponsors"

