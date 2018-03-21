package Lesson1_11

fun main(args: Array<String>) {
    val a = scan.nextInt()

    val out = when(a){
        5 -> "Число равно 5"
        6 -> "Число равно 6"
        else -> "Число не равно ни 5, ни 6"
    }
    print(out)
}