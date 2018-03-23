package Lesson1_16

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    var a = scan.nextInt()+scan.nextInt()+scan.nextInt()

    print(a.toString().last()+a.toString().substring(1,a.toString().length-1)+a.toString().first())
}