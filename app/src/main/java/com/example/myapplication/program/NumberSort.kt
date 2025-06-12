package com.example.myapplication.program

fun numberSort(){

    var arr = arrayOf(4,5,3,2,6,7,8,33,12,44,)

    for (i in  arr.indices){
        for (j in 0 until arr.size -i -1 ){
            if(arr[j] > arr[j + 1]){
                val temp = arr[j]

                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }


    println("Sorted in Ascending Order:")
    for ( num in arr){
        print(", $num")
    }




}