package Lesson1_18

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    val s = scan.next()
    print(isCapitalized2(s))
}

fun isCapitalized2(s: String):Boolean {
    return s[0].isUpperCase()
}

