package com.example.myapplication.program

fun palindromeNumber(str: Int) : Boolean{
    var original = str
    var reversed = 0
    while (original != 0){
        val digit = original % 10
        reversed = reversed * 10 + digit
        original/=10
    }
    return str == reversed
}