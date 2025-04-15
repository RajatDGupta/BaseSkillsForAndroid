package com.designpattern.creational

/**
 * Created by 1000292 on 02-11-2022
 * BFDL
 * PUNE.
 */
object Singleton

/*
class Singleton private constructor() {

    companion object {

        @Volatile
         private var instance: Singleton? = null // Volatile modifier is necessary

        fun getInstance() =
            instance ?: synchronized(this) { // synchronized to avoid concurrency problem
                instance ?: Singleton().also { instance = it }
            }
    }
}*/

// href=https://medium.com/@ZahraHeydari/singleton-pattern-in-kotlin-b09380c53b14

/*class Singleton private constructor() {
    companion object {
        val INSTANCE: Singleton by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { Singleton() }
    }
}*/


/*fun main() {
    println(Database())
    println(Database())
}

class Database private constructor(){
    companion object{
        private var instance : Database ? = null

        operator fun invoke ()  = synchronized(this){
            if(instance==null)
                instance = Database()
            instance
        }
    }
}*/


/*class UsersDatabase : RoomDatabase() {

    companion object {

        @Volatile private var INSTANCE: UsersDatabase? = null

        fun getInstance(context: Context): UsersDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                UsersDatabase::class.java, "Sample.db")
                .build()
    }
}*/
