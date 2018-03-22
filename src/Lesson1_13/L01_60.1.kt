package Lesson1_13

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a = Math.round(scan.nextDouble())
    var b = Math.round(scan.nextDouble())
    if (a == b)
        print("Да")
    else
        print("Нет")
}