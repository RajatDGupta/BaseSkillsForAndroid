package com.solidprinciple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by 1000292 on 23-08-2022
 * BFDL
 * PUNE.
 */


/**
   The Liskov Substitution Principle (LSP)
   Child classes should never break the parent class’ type definitions.
 */


class MainActivityA : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_main)

      // Here it is presented a way how to organize these Rectangle and Square classes better to
      // meet the Liskov Substitution Principle. No more unexpected result.
      val rectangleFirst: Shape = Rectangle(2,3)
      val rectangleSecond: Shape = Square(3)

     rectangleFirst.area().toString()
      rectangleSecond.area().toString()
   }
}

class Rectangle(var width: Int, var height: Int) : Shape() {

   override fun area(): Int {
      return width * height
   }
}

class Square(var edge: Int) : Shape() {
   override fun area(): Int {
      return edge * edge
   }
}

abstract class Shape {
   abstract fun area(): Int
}
