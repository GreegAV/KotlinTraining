package Lesson1_13


fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a1 = scan.nextDouble()
        print(Math.sin(a1)*Math.cos(a1))
}