package Lesson1_11

fun main(args: Array<String>){
    val a = scan.nextInt()

    when(a){
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> {print("F")}
        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> {print("T")}
        1,10,100,1000,10000 -> {print("P")}
        else -> {print("N")}
    // write your code here...
    }
}