package Lesson1_14

fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    var s1= scan.next()
    var s2 = s1.replace(scan.next(),"_")

    print(s2+" "+(s2.length-s2.replace("_","").length))
}