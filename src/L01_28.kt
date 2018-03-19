
fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    var a=scan.nextLine()
    // Напишите ваш код здесь
    print(a[0]+"F"+a.substring(2,a.length-2)+"L"+a[a.length-1])
}