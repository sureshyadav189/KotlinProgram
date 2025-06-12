package com.example.myapplication.program

fun countVowelConst(){
    val name = "SURESH KUMAR"
    val vowelList = listOf('A','E','I','O','U')
    var vowelCount = 0
    var constCount = 0

    for (char in name){
        if(char in 'A'..'Z' || char in 'a'..'z'){
            if(char in vowelList){
                vowelCount++
            }
            else{
                constCount++
            }
        }
    }

    println("name = $name")
    println("vowelCount = $vowelCount")
    println("constCount = $constCount")
}