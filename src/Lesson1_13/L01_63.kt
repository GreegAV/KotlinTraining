package Lesson1_13


fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()
    var d = scan.nextInt()
    var e = scan.nextInt()
    var f = scan.nextInt()
    print((a*b+c)*e-f+2*d)

}