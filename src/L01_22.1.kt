// Создаем Scanner

fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    //write your code here.
    var b=scan.nextInt()
    print(b%10)
    print(b/10%10)
    print (b/100)

}