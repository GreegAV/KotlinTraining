package Lesson1_13

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()
    when {
        ((a+b)/c)<10000 -> print(100000*50/100)
        ((a+b)/c)<12000 -> print(100000*40/100)
        ((a+b)/c)<16000 -> print(100000*30/100)
        ((a+b)/c)<18000 -> print(100000*20/100)
        ((a+b)/c)<20000 -> print(100000*10/100)
        else -> print(0)
    }


}