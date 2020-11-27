package smarthead.basic

fun main() {
    var name = "Omor"
    display(name)
    output()
    add()
    var area =findArea(40, 50)
    println(area)
    println(findArea(4,5))
    areaCal(7,2)
    println(max(13,12))
    var largeValue:Int = maximum(11,15)
    println("The greater value $largeValue")
}

fun display(name: String){
    println(name)
}
fun output(){
    println("Inca Ruin")
}

fun add(){
    var a = 10
    var b = 20
    println("Sum is: ${a+b}")
}

fun findArea(length:Int, breadth:Int):Int{
    return length * breadth
}
fun areaCal(length:Int, breadth:Int){
    println(length * breadth)
}

// Function in one line
fun  max(a:Int, b:Int):Int = if (a>b) a else b

fun  maximum(a:Int, b:Int):Int =
        if (a>b) {
            println("$a is greater")
            a
        }
        else {
            println("$b is greater")
            b
            60
        }