package Lesson1_07
fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    //write your code here.
    var a=scan.nextInt()
    print(1000*(a%10)+100*(a%100/10)+10*(a%1000/100)+a/1000)


}