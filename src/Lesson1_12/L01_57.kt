package Lesson1_12

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
    var a=scan.nextDouble()
    print(Math.round(Math.PI*(a*a)))
}