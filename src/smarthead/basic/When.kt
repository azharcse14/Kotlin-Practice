package smarthead.basic

fun main(){
    val x = 5

    when(x){
        1-> println("x is 1")
        2-> println("x is 2")
        3-> println("x is 3")
        else-> println("x is unknown")
    }

    when(x){
        1,5-> println("x is $x")
        2-> println("x is 2")
        3-> println("x is 3")
        else-> println("x is unknown")
    }

    when(x){
        in 1..10-> println("x is $x")
        2-> println("x is 2")
        3-> println("x is 3")
        else-> println("x is unknown")
    }

    when(x){
        !in 1..10-> println("x is $x")
        2-> println("x is 2")
        3-> println("x is 3")
        else-> println("x is unknown")
    }

    val y = 7

    when{
        x < y -> println("x is less than y")
        x > y -> println("X is greater than y")
        else -> println("X must equal y")
    }

    var str:String

    when(x){
        1-> str ="x is 1"
        2-> str ="x is 2"
        3-> str ="x is 3"
        else-> str ="x is unknown"
    }
    println(str)

    str = when(x){
        1->"x is 1"
        2-> "x is 2"
        5-> "x is 5"
        else-> "x is unknown"
    }
    println(str)

    whatNumber(1)
}

fun whatNumber(x: Int) {
    when (x) {
        0 -> println("x is zero")
        1 -> println("x is 1")
        else -> println("X is neither 0 or 1")
    }
}
