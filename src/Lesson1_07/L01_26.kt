package Lesson1_07
fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    // Напишите ваш код здесь
    var a=scan.nextLine()
    var a1=a.substringBefore(" ")
    a=a.substringAfter(" ")
    var a2=a.substringBefore(" ")
    a=a.substringAfter(" ")
    var a3=a.substringBefore(" ")
    a=a.substringAfter(" ")
    var a4=a.substringBefore(" ")
    a=a.substringAfter(" ")

    print(a+" "+a4+" "+a3+" "+a2+" "+a1)
}
