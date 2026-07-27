package com.programms.string_programm


fun vowelPresent(str:String): Boolean {
    var isVowelPresent=false
    for(i in str.indices){
        when(str[i]){
            'a','e','i','o','u','A','E','I','O','U'-> {
                isVowelPresent=true
            }
        }
        if(isVowelPresent){
            break
        }
    }
    return isVowelPresent
}