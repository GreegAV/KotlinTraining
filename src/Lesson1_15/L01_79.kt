package Lesson1_15

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    var a = scan.nextLine()[0]

    if (a.isLetter()) {
        if (a.isLowerCase())
            print(a.toUpperCase())
        else
            print(a.toLowerCase())
    }
    else print("incorrect")

}