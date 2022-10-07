package com.solidprinciple

/**
 * Created by 1000292 on 23-08-2022
 * BFDL
 * PUNE.
 */

/**
   The Open-Closed Principle (OCP)

   Software entities (classes, modules, functions, etc…)
   should be open for extension, but closed for modification
 */


// Open closed principle: good example
// Shape.java
interface Shape {
    fun getArea(): Double
}

// Rectangle.java
class Rectangle : Shape {
    private val length = 0.0
    private val height = 0.0

    // getters/setters ...
    override fun getArea(): Double {
        return length * height
    }

}

// Circle.java
class Circle : Shape {
    private val radius = 2.0

    // getters/setters ...
    override fun getArea(): Double {
        return radius * radius * Math.PI
    }


}

// AreaFactory.java
class AreaFactory {
    fun calculateArea(shape: Shape): Double {
        return shape.getArea()
    }
}

fun main() {
    println(AreaFactory().calculateArea(Circle()))
    println(AreaFactory().calculateArea(Rectangle()))


}