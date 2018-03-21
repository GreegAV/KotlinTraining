package Lesson1_11

val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    print("Enter a: ")
    when (scan.nextInt()) {
        5 -> {
            print("5!")
        }
        in (6..10) -> {
            print("6-10!")
        }
        !in (0..5) -> {
            print("! 0-5")
        }
        else -> {
            print("ELSE!")
        }

    }
}