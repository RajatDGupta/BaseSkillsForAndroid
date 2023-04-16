package com.designpattern.creational

interface ICurrency {
    fun symbol(): String
    fun code(): String
}

class Euro : ICurrency {
    override fun symbol(): String {
        return "€"
    }
    override fun code(): String {
        return "EUR"
    }
}

class UnitedStatesDollar : ICurrency {
    override fun symbol(): String {
        return "$"
    }
    override fun code(): String {
        return "USD"
    }
}

enum class Country {
    UnitedStates, Spain, UK, Greece
}

fun currency(country: Country): ICurrency? {
    return when (country) {
        Country.Spain, Country.Greece -> Euro()
        Country.UnitedStates -> UnitedStatesDollar()
        else -> null
    }
}

fun main(args: Array<String>) {
    val noCurrencyCode = "I am not Creative, so Currency Code Available"

    println(currency(Country.Greece)?.code() ?: noCurrencyCode)
    println(currency(Country.Spain)?.code() ?: noCurrencyCode)
    println(currency(Country.UnitedStates)?.code() ?: noCurrencyCode)
    println(currency(Country.UK)?.code() ?: noCurrencyCode)
}