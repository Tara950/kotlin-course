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

var status: String = "Не начат"

val notstarted: String = "Список спонсоров"

var internetAccessLevel: Int = 4

private var information: String = "Информация о транспортировке"

var numberOfCommands: Int = 0

val tasks: String = "Задачи"

val evacuationPlan: String = "План эвакуации"

var listOfAvailableEquipment: String = "85"

var listOfFreeEquipment: String = "85"

lateinit var mealSchedule: String

val disasterPlan: String = "План на случай сбоя"

var listOfExpertsAndJury: String = "Список жури и экспертов"

val metod: String = "Методы и процедуры для сбора отзывов"

private val privacyPolicy: String = "Политика конфиденциальности"

private val privateReviews: String by lazy { "" }

var temperatureIndoor: Int = 26

val monitoring: String = "Мониторинг и анализ производительности сетевого оборудования "

var lightingLevel: Int = 1200

private  val eventLog: String = "Лог событий мероприятия"

val availabilityOfMedicalCare: Boolean = true

private val securityPlan: String = "Планы и процедуры для обеспечения безопасности"

val eventRegistrationNumber: Int = 234367

val maximumPermissibleNoiseLevel: Int = 75

var noiseLevelIndicator: String = "Индикатор превышения уровня шума"

var eventFormat: String = "Формат мероприятия"

var numberOfAvailableSeats: Int = 149
    get() = field
    set(value) {
        if (value >= 0) field += value
    }

val pressRelationsPlan: String = ""

private val projectInformation: String by lazy { "" }

var permissionStatus: String = ""

val exclusiveResources: Boolean = true or false

val listPartners: String = "Список партнеров "

lateinit var report: String

val prizeDistributionPlan: String = ""

private val contactInformation: String = "+123953848"

val specialConditions: String = ""

val maximumNumberOfPeople: Int = 150

val  standardNumberOfHours: Int = 2*60*60