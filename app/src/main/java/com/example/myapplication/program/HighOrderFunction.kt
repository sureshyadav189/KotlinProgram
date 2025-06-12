package com.example.myapplication.program

fun highOrderMain(){
    val sum = {a:Int,b:Int -> a + b}
    highOrder(5,6,sum)
}

fun highOrder(a:Int,b:Int,fn:(Int,Int) -> Int){
    val result = fn(a,b)
    print("Result = $result")
}