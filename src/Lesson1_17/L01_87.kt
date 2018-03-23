package Lesson1_17

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    var s=""
    var n:Int

    repeat(10) {
        n = scan.nextInt()
        s=n.toString()+" " +s
    }
    print(s)
}