package Lesson1_18

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    val s1 = scan.next().first()
    val s2 = scan.next().first()
    print(isCaseEquals(s1, s2))
}

fun isCaseEquals(s1: Char, s2: Char): Boolean {

    return s1.equals(s1.toUpperCase()) && s2.equals(s2.toUpperCase()) ||
            s1.equals(s1.toLowerCase()) && s2.equals(s2.toLowerCase())

//    s1.isUpperCase() == s2.isUpperCase()

}


