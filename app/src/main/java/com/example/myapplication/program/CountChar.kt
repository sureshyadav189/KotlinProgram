package com.example.myapplication.program

fun countChar(){
    val sent =  "My Name is Suresh Yadav"
    var word = ""
    var words = ArrayList<String>()

    for(i in 0 until sent.length){
        val ch = sent[i]
        if(ch != ' '){
            word += ch
        }
        else {
            words.add(word)
            word = ""
        }

    }
    words.add(word)


    for (i in words.size -1 downTo 0){
        print(words[i])
        if (i != 0){
            print(" ")
        }
    }

}