package Lesson1_14


fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    var a = scan.next()
    var b = scan.next()

    print(when {
        a.startsWith(b) -> 1
        a.endsWith(b) -> 3
        a.contains(b) -> 2
        else -> 4
    })


}