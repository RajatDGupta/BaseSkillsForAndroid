package com.designpattern.creational

interface Payment {
    fun pay()
}
class CardPayment : Payment {
    override fun pay() {
        println("Paid using Card")
    }
}

class UpiPayment : Payment {
    override fun pay() {
        println("Paid using UPI")
    }
}

object PaymentFactory {

    fun create(type: String): Payment {
        return when(type) {
            "CARD" -> CardPayment()
            "UPI" -> UpiPayment()
            else -> throw IllegalArgumentException()
        }
    }
}

fun main() {
    val payment = PaymentFactory.create("UPI")
    payment.pay()
}