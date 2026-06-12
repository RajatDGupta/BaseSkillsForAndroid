package com.designpattern.creational

/**
 * Created by 1000292 on 02-11-2022
 * BFDL
 * PUNE.
 */
class Student private constructor( val name: String? = null,
                                    val age: Int? = null,
                                    val email: String? = null,
                                    val rollNumber: String? = null,
                                    val course: String? = null){
    data class Builder(
        var name: String? = null,
        var age: Int? = null,
        var email: String? = null,
        var rollNumber: String? = null,
        var course: String? = null) {

        fun name(name: String) = apply { this.name = name }
        fun age(age: Int) = apply { this.age = age }
        fun email(email: String) = apply { this.email = email }
        fun rollNumber(rollNumber: String) = apply { this.rollNumber = rollNumber }
        fun course(course: String) = apply { this.course = course }
        fun build() = Student(name, age, email, rollNumber, course)
    }

   /* val student = Student.Builder()
        .name("John Doe")
        .age(20)
        .email("john@example.com")
        .rollNumber("12345")
        .course("Computer Science")
        .build()*/

}