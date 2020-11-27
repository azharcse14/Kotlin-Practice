package smarthead.basic

fun main() {
    var a = 23
    var b:Int = 45
    var c = "33"
    var d: String = "66"
    val name:String
    name = "Rupai"


    println(a+b)
    println(a.plus(b))
    println(a.minus(b))
    println(c+d)

    val rawString = """raw string is super useful for strings that span many lines
        | ttyhkji uihiuiy  nuhjuiuji
        | jijokojui uh9oiojjii
        | yuhujjuji
        | jjiooko
        | kikplh8yiuio
        | uiiiojjjjjjjjjy
    """.trimMargin()

    println(rawString)

    val leftShift = 1 shl 2
    val rightShift = 1 shr 2
    val unsignedRightShift = 1 ushr 2
    val and = 1 and 0x00001111
    val or = 1 or 0x00001111
    val xor = 1 xor 0x00001111
    val inv = 1.inv()

    println(leftShift)
    println(rightShift)
    println(unsignedRightShift)
    println(and)
    println(or)
    println(xor)
    println(inv)
    println()

}