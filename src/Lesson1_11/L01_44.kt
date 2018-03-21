package Lesson1_11

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    when(scan.nextInt()) {
        in(6..8), 5, in(100..105) -> print("A")
        in(80..85), -1 -> print("B")
        else -> print("C")
    }
}