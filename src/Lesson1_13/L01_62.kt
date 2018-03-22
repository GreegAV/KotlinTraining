package Lesson1_13

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a1 = scan.nextInt()
    var a2 = scan.nextInt()
    var a3 = scan.nextInt()
    var a4 = scan.nextInt()

    if (scan.nextBoolean())
        print(Math.min(Math.min(a1, a2), Math.min(a3, a4)))
    else
        print(Math.max(Math.max(a1, a2), Math.max(a3, a4)))
}