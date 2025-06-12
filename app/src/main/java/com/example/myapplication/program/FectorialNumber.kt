package com.example.myapplication.program

fun factorialNumber(num:Int){

    var f = 1
    for (i in 1..num){
        f*=i
    }

    print("result = $f")
}