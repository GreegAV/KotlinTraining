package Lesson1_13


fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a1 = scan.nextInt()
    var a2 = scan.nextInt()

    if ((a1+a2)%2==0) print(Math.min(a1,a2)) else
        print(Math.max(a1,a2))
}