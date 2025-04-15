package com.solidprinciple

/**
 * Created by 1000292 on 24-08-2022
 * BFDL
 * PUNE.
 */

/**
 * High-level modules should not depend on low-level modules. Both should depend on the abstraction.
 */

interface Database {
    fun getData(): String
}

class SQLiteDatabase: Database {
    override fun getData(): String {
        // Code to retrieve data from SQLite database
        return "SQLiteDatabase data fetch"
    }
}

class DaoDatabase: Database {
    override fun getData(): String {
        // Code to retrieve data from Dao database
        return "DaoDatabase data fetch"
    }
}

class DataManager(private val database: Database) {
    fun processData() {
        val data = database.getData()
            // Code to process data
        println(data)
    }
}

fun main(){
    DataManager(SQLiteDatabase()).processData()
    DataManager(DaoDatabase()).processData()
}