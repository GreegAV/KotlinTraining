package Lesson1_12

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
    print(Math.round(9.8*scan.nextDouble()*scan.nextDouble()))
}