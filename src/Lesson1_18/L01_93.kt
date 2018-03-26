package Lesson1_18

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    val s1 = scan.next()
    val s2 = scan.next()
    val b  = scan.nextBoolean()
    print(check(s1,s2,ignoreCase = b))
}

fun check(s1: String, s2: String, ignoreCase: Boolean): Boolean {

    if (ignoreCase) return s1.first().toUpperCase()==s2.first().toUpperCase()
    return s1.first()==s2.first()

//    return s1[0].equals(s2[0], ignoreCase)
}

