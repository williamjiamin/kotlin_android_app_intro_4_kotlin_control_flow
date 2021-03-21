package com.lexueoude.kotlin_intro_control_flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val num: Int = 9
//
//        var result: String = ""
//
//        if (num % 2 == 0) {
//            result = "This is a even number!!!!"
//        } else {
//            result = "This is an odd number!!!!"
//        }


//        Log.d("From:lexueoude.com", result)

//        val firstNum: Float = 88.8f
//        val secondNum: Float = 66.6f
//
//        val max = if (firstNum > secondNum) {
//            firstNum
//        } else {
//            secondNum
//        }
//
//        Log.d("From:lexueoude.com", "The max number is : $max")


//        val age: Int = 68
//
//        val ageRange = if (age <= 10) {
//            "Child"
//        } else if (age > 10 && age <= 18) {
//            "Teen"
//        } else if (age > 18 && age <= 28) {
//            "Young Adult"
//        } else if (age > 28 && age <= 58) {
//            "Adult"
//        } else if (age > 58 && age <= 78) {
//            "Middle Age"
//        } else {
//            "Elderly"
//        }
//        Log.d("From:lexueoude.com", "The age you entered  is : $ageRange")

//        val dayNum: Int = 77
//
//        val day = when (dayNum) {
//            1 -> "Monday"
//            2 -> "Tuesday"
//            3 -> "Wednesday"
//            4 -> "Thursday"
//            5 -> "Friday"
//            6 -> "Saturday"
//            7 -> "Sunday"
//            else -> "Invalid-day"
//        }
//
//        Log.d("From:lexueoude.com","The day in the week you have entered is : $day")
//
//        val whatToDo = when(dayNum){
//            1,2,3,4,5 -> "Go to work"
//            6,7 -> "Go to park"
//            else -> "Invalid day"
//        }
//
//        Log.d("From:lexueoude.com","I am going to :  $whatToDo ")

//        val ourNum  : Int = 3
//
//        val howBigIsTheNum  = when(ourNum){
//            in 1..9 -> "Very small number"
//            in 10..99 -> "Small number"
//            in 100..999 -> "Normal number"
//            in 1000..9999 -> "Very big number"
//            else -> "Very very big number"
//
//        }
//
//        Log.d("From:lexueoude.com","How big is your number? $howBigIsTheNum")
//        val dataType : Any = false
//
//        val theInputDataType = when(dataType){
//            is Int -> "The data type is Int"
//            is Float -> "The data type is Float"
//            is String -> "The data type is String"
//            is Boolean -> "The data type is Boolean"
//            is Array<*> -> "The data type is Array"
//            else -> "The data type we can't recognize"
//        }
//
//        Log.d("From:lexueoude.com","The message of datatype is: $theInputDataType")

//        var theIncreasingNum: Int = 88
//
//        while (theIncreasingNum < 10) {
//            theIncreasingNum +=1
////            theIncreasingNum = theIncreasingNum + 1
//            Log.d("From:lexueoude.com","The Num is increasing right now: $theIncreasingNum")
//
//
//
//        }

//        do {
//            theIncreasingNum+=1
//            Log.d("From:lexueoude.com","The Num is increasing right now by do-while method: $theIncreasingNum")
//        }while (theIncreasingNum < 10)
//        for (i in 1..10) {
//            Log.d("From:lexueoude.com", "The Num is increasing right now by for loop method: $i")
//        }
//
//        for (i in 10 downTo 1) {
//            Log.d("From:lexueoude.com", "The Num is decreasing right now by for loop-downto method: $i")
//        }
//
//        for (i in 1..100 step 5) {
//            Log.d("From:lexueoude.com", "The Num is increasing right now by for loop-with step method: $i")
//        }
//        val ourArray : Array<String> = arrayOf("lexueoude.com","kotlin","intro","My name is","github.com/williamjiamin")
//
//        for (element in ourArray){
//            Log.d("From:lexueoude.com","Every element in our array: $element")
//        }
//
//        for (index in ourArray.indices){
//            Log.d("From:lexueoude.com","Every element and index in our array: the index is $index and the array is ${ourArray[index]}")
//        }
//
//        for ((index,element) in ourArray.withIndex()){
//            Log.d("From:lexueoude.com","Every element and index in our array: the index is $index and the array is $element")
//        }

        val ourString: String? = null

        Log.d("From:lexueoude.com", "When we use null safe operator : ${ourString?.length}")


        ourString?.let {
            Log.d("From:lexueoude.com", "When we use let operator : ${it.length}")
        }

//        val ourLength = if (ourString != null) {
//            ourString.length
//        } else {
//            -1
//        }
        val ourLength = ourString?.length ?: -1


        Log.d("From:lexueoude.com", "When we use elvis operator : $ourLength")


        val length01 = ourString!!.length

        Log.d("From:lexueoude.com","When we don't care about null pointer exception : $length01")


    }
}