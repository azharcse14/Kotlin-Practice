package smarthead.basic

fun main(args: Array<String>){
    //Ranges
    val r1 = 1..5 //The range contains the number 1,2,3,4,5

    val r2 = 1..5 step 2 //The range contains the number 1,3,5

    val r3 = 5 downTo 1 //The range contains the number 5,4,3,2,1

    val r4 = 5 downTo 1 step 2 //The range contains the number 5,3,1

    val r5 = 'a'..'z' //The range contains the value from 'a','b','c',.....,'z'

    val r6 = "a".."z" //The range contains the value from "a","b","c",.....,"z"

    val isPresent = "c" in r6 //C is present in r6 check this

    var countDown = 10.downTo(1) //The range contains the number 10,9,8,7,6,5,4,3,2,1

    var moveUp = 1.rangeTo(10) //The range contains the number 1,2,3,4,5,6,7,8,9,10

    println(r1)
    println(r2)
    println(r3)
    println(r4)
    println(r5)
    println(r6)
    println(isPresent)
    println(countDown)
    println(moveUp)




}