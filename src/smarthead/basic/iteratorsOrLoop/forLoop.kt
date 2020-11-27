package smarthead.basic.iteratorsOrLoop

fun main(){
    val oneToTen = 1..10

    for (i in oneToTen){
        if (i<=9){
            println("0$i Bangladesh")
        }else{
            println("$i Bangladesh")
        }

    }

//    for (k in oneToTen) {
//        for (j in 1..5) {
//            println(k * j)
//        }
//    }

    val string = "print my characters"
    for (char in string) {
        println(char)
    }
}