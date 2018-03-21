package Lesson1_11

fun main(args: Array<String>){
    val a = scan.nextInt()

    when(a){
        in 10..99 -> {print("A")}
        in 100..999 -> {print("B")}
        else -> {print("C")}
    // write your code here...
    }
}