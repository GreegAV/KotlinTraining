package Lesson1_14

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a = scan.next()
    var b = scan.next()
    var c=0
    while (!a.equals(a.replace(b,"_")))
    {
        a=a.replaceFirst(b,"_")
        c++
    }
    print(a+" "+c)


}