package Lesson1_17

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    var n = scan.nextInt()
    var s = ""
    repeat(n) {
        s=s+" "+scan.next()
    }
    print(s.reversed())
}