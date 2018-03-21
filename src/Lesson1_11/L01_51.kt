package Lesson1_11

fun main(args: Array<String>) {
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    when {
        a in 0..100 -> { print("0-100") }
        (a >= 0 || b + c == 7) -> { print("a >= 0 || b + c == 7") }
        scan.nextBoolean() -> { print("Boolean")}
        scan.next().length == 0 -> { print("length==0") }
        else -> { print("Else") }

    }
}