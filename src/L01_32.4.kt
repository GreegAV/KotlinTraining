fun main(args: Array<String>) {
    val scan = java.util.Scanner(System.`in`)
    var a = scan.nextInt()
    if (a==0) {
        print("Число равно нулю")
    } else
    if (a > 0) {
        print("Число положительное")
    } else {
        print("Число отрицательное")
    }
}