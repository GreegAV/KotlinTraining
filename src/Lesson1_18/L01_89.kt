package Lesson1_18


fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextInt()
    print(mult(a,b))
}

fun mult(a: Int, b: Int): Int {
    return a*b
}
