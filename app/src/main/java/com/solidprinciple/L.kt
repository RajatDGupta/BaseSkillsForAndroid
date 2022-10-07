package com.solidprinciple

/**
 * Created by 1000292 on 23-08-2022
 * BFDL
 * PUNE.
 */


/**
   The Liskov Substitution Principle (LSP)
   Child classes should never break the parent class’ type definitions.
 */


open class Vehicle{
   open fun getInteriorWidth():Int {
      return 0
   }
}

class SwiftCar : Vehicle() {
   private val swiftInteriorWidth=20
   override fun getInteriorWidth(): Int {
      return swiftInteriorWidth
   }

}

class HyundaiCar : Vehicle() {
   private val hyundaiInteriorWidth=17
   override fun getInteriorWidth(): Int {
      return hyundaiInteriorWidth
   }
}



fun main() {
   val list = mutableListOf(SwiftCar(),HyundaiCar())

   list.forEach {
      println(it.getInteriorWidth())
   }
}
