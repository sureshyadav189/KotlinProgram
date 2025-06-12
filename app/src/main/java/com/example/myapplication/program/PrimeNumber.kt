package com.example.myapplication.program

fun primeNumber(num: Int): Boolean {

    if (num == null) print("Invalid Input")

    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    var i = 3

    while (i * i < num) {
        if ( num % i == 0) {
            return false
        }
        i += 2
    }

    return true
}