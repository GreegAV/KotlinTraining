package Lesson1_13

fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

    var a = scan.nextInt()
    var b = scan.nextDouble()

    when (a){
      1 -> print(Math.pow(b,b))
      2 -> print(Math.floor(b).toInt())
      3 -> print(Math.ceil(b).toInt())
      4 -> print(Math.round(b).toInt())
      5 -> print(Math.abs(b))
      6 -> print(Math.sqrt(b))
      else -> print(2*b*b)
    }


}