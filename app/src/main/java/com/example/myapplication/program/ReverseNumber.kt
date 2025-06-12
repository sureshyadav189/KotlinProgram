package com.example.myapplication.program

fun reverseNumberFun(num:Int){
    var original = num
    var  reverse = 0

    while (original != 0){
        val digit = original % 10
        reverse = reverse * 10 + digit
        original/=10
    }


    print("revesed number is $reverse")
}