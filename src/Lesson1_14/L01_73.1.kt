package Lesson1_14


fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    var s1 = scan.next()
    var s2 = scan.next()

    if (s1.contains(s2)) {
        when {
            s1[0].equals(s2[0]) -> print("1")
            s1[s1.length-1].equals(s2[0]) -> print("3")
            else -> print("2")
        }
    } else
    {
        print("4")
    }


}