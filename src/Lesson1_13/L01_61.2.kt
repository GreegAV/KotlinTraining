package Lesson1_13

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    print (Math.max(Math.max(scan.nextInt(),scan.nextInt()),Math.max(scan.nextInt(),scan.nextInt())))
}