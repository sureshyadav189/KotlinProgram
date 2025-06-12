package com.example.myapplication.program

fun isArmStrongNumber(num:Int) : Boolean{
    var count = 0
    var temp = num

    //Step 1 count the digits

    while (temp != 0){
        count += 1
        temp/=10
    }
    var sum = 0
    temp = num

    // step 2 calculate the sum of digits

    while (temp != 0){
        val digit = temp % 10
        var power = 1
        for (i in 1..count){
            power*=digit
        }
        sum +=power
        temp /= 10
    }

return sum == num
}