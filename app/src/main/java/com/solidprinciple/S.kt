package com.solidprinciple


/**
 * Created by 1000292 on 23-08-2022
 * BFDL
 * PUNE.
 */

/**
   Single Responsibility principle
   The Single responsibility Principle states that every
   class should have one and only one responsibility. In other words,
   If there is a need to change the class for more than one reason then
   that defies the single responsibility principle.
 */

// https://www.freecodecamp.org/news/kriptofolio-app-series-part-1/
// https://medium.com/android-news/android-development-the-solid-principles-3b5779b105d2
// https://proandroiddev.com/exploring-s-o-l-i-d-principle-in-android-a90947f57cf0

data class User(val name: String)

class UserRepository{
   fun saveUser(user: User){}
}

class EmailService{
   fun sendEmail(user: User){}
}

class UserValidator{
   fun validate(user: User){}
}
