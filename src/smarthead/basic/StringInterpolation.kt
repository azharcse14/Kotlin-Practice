package smarthead.basic

fun main(args: Array<String>){
    var name = "Musa"
    var str = "Hello $name"
    println(str)
    println("The number of character in statement is ${str.length}")

    val a = 10;
    val b = 20;

    println("The sum of $a and $b is ${a+b}")

    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 3

    println("The length of Rectangle is ${rect.length} and ${rect.breadth}. The area is ${rect.length*rect.breadth}")
}

class Rectangle{
    var length:Int=0
    var breadth:Int=0
}