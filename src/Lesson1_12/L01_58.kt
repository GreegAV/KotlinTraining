package Lesson1_12

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
//    var a=scan.nextDouble()
//    var b=scan.nextDouble()
    print(Math.round(9.8*scan.nextDouble()*scan.nextDouble()))
}