package StacKLearner

fun main() {
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