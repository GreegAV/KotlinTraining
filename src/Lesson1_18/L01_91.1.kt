package Lesson1_18

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    val s = scan.next()
    print(isCapitalized1(s))
}

fun isCapitalized1(s: String):Boolean {
 return s[0].equals(s[0].toUpperCase())
}

