package Lesson1_11

fun main(args: Array<String>){
    val a = scan.nextLine()

    when(a.length){
        in 0..10 -> {print("A")}
        20 -> {print("B")}
        15 -> {print("C")}
        else -> {print("D")}
    // write your code here...
    }
}