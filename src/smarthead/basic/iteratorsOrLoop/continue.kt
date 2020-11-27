package smarthead.basic.iteratorsOrLoop

fun main(){

    for (i in 1..10){
        if (i==5){
            continue
        }
        println(i)
    }

    for (i in 1..10){
        if (i%2==0){
            continue
        }
        println(i)
    }

    for (i in 1..3){
        for (j in 1..3){
            if (i==2 && j==2){
                continue
            }
            println("$i $j")
        }
    }

    outer@ for (i in 1..3){
        for (j in 1..3){
            if (i==2 && j==2){
                continue@outer
            }
            println("$i $j")
        }
    }
}