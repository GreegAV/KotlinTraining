package Lesson1_10

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    var a= scan.nextLine()
    if (a.length%2==0) {
        println("even")
    } else
        println("odd")
}