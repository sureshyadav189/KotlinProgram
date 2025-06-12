package com.example.myapplication.program

fun fibonicciSerious(num:Int){
    var a = 0
    var b = 1

    print("Fibonicci Serious - > $a, $b")

    for (i in 2..num){
        var c = a + b
        print(", $c")
        a = b
        b = c
    }
}