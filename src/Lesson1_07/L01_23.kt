package Lesson1_07

// Создаем Scanner

fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    //write your code here.
    var a=scan.nextInt()
    var b=scan.nextInt()
    print (a/100+a%10 +b/100+b%10)

}