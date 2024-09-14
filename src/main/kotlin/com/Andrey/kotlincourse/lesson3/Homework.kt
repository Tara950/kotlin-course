package com.Andrey.kotlincourse.lesson3

val name: String = "Hackathon Survival"

var date: String = "15.04.2025"

val place: String = "St.Petersburg, Malaya Morskaya st., 10 "

val budget: String = "250000"

var participants: Int = 0
    get() = field
    private set(value) {field=value}

var duration: Long = 12*60*60

private var contactinformation: String = ""

var status: String = "not started"

val notstarted: String = "list of sponsors"

var internetAccessLevel: Int = 4

private var information: String = "Transportation information"

var numberOfCommands: Int = 0

val tasks: String = "Tasks"

val evacuationPlan: String = "Evacuation plan"

var listOfAvailableEquipment: String = "85"

var listOfFreeEquipment: String = "85"

val disasterPlan: String = "Disaster plan"

lateinit var mealSchedule: String

var listOfExpertsAndJury: String = ""

val metod: String = ""

var temperatureIndoor: Int = 26

private val privacyPolicy: String = ""

private val privateReviews: String by lazy { "" }

val monitoring: String = ""

var lightingLevel: Int = 1200

private  val eventLog: String = ""

val availabilityOfMedicalCare: Boolean = true

val securityPlan: String = ""

val eventRegistrationNumber: Int = 234367

val maximumPermissibleNoiseLevel: Int = 75

var noiseLevelIndicator: String = ""

var eventFormat: String = ""

var numberOfAvailableSeats: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field += value
    }

val pressRelationsPlan: String = ""

private val projectInformation: String by lazy { "" }

var permissionStatus: String = ""

val exclusiveResources: Boolean = true or false

val listPartners: String = ""

lateinit var report: String

val prizeDistributionPlan: String = ""

private val contactInformation: String = "+123953848"

val specialConditions: String = ""

val maximumNumberOfPeople: Int = 150

val  standardNumberOfHours: Int = 2*60*60