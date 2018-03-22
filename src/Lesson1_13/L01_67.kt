package Lesson1_13

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var m = scan.nextDouble()
    var n = scan.nextDouble()

    if (m/n>1) print(Math.round(m/n)) else print(1)
}