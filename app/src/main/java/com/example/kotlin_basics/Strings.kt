package com.example.kotlin_basics

fun main(){
   // print("hello World");
  //  print("\n \n ${st()}")
    print(str())

    print("\n${stt()}")
}

//fun st() {
//    print( "my name is shariq ")
//}

fun str(firstName:String=" NUll" , lastName:String=" NUll"): String{
    return firstName + lastName
}

fun stt(firstName:String=" NUll" , lastName:String=" NUll"):String= firstName + lastName