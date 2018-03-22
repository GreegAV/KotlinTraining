package Lesson1_10

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    var a=scan.nextInt()
    var b=a/10
    a=a%10
    print((a+b)%2==0)


}