package smarthead.basic.iteratorsOrLoop

fun main(){
    for (i in 1..10){
        println(i)
        if (i==5)
            break
    }

    for (i in 1..3){
        for (j in 1..3){
            println("$i $j")
            if (i==2 && j==2)
                break
        }
    }

    labeled@ for (i in 1..3){
        for (j in 1..3){
            println("$i $j")
            if (i==2 && j==2)
                break@labeled
        }
    }
}