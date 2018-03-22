package Lesson1_13

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var max = scan.nextInt()
    var temp = scan.nextInt()
    if (max < temp)
        max=temp
    temp = scan.nextInt()
    if (max < temp)
        max=temp
    temp = scan.nextInt()
    if (max < temp)
        print(temp)
    else
        print(max)
}