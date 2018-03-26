package Lesson1_18

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(calc(a,b))
}

fun calc(a: Int, b: Int): Int {
    return 7*(a*a-b*b*b)*(a-b)
}
