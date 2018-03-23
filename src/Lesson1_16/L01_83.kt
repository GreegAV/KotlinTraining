package Lesson1_16

import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    // Ваш код здесь
    var a= scan.nextLong()
    a++
    var b=a.toString()
    print (b.substring(0,b.length-2)+'Σ'+b[b.length-1])
}
