package smarthead.basic

fun main(){
    val b=2
    val c=5

    var maxValue:Int

    if (b>c)
        maxValue = b
    else
        maxValue = c

    println(maxValue )

    var minValue:Int = if (b<c) b else c
    println(minValue)

    if (2==2){
        println("2 equal 2")
    }else{
        println("2 is not equal 2")
        print("I dont know what is 2")
    }

    var x = 90

    if (x>=80){
        print("A+")
    }else if (x>=70){
        print("A")
    }else if (x>=33){
        println("pass")
    }else{
        println("Fail")
    }

    var a = 16

    if (a>=18)
        println("Adult")
    else if (a>=13 && a<=18)
        println("teen")
    else
        println("Child")

    var result = if (a>=18)
        "Adult"
    else if (a>=13 && a<=18)
        "teen"
    else
        "Child"

    println(result)
}