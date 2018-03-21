package Lesson1_11

fun main(args: Array<String>) {
    val a = scan.nextInt()
    print(when(a){
        0 -> "waiting"
        1 -> "ok"
        -1 -> "err"
        else -> "UNDEFINED"
    })
}