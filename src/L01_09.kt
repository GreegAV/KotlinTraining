fun main(args: Array<String>){
    val scan = java.util.Scanner(System.`in`)
    print(scan.hasNext()) // true
    scan.nextInt()        // Считываем число и не помещаем никуда
    print(scan.hasNext()) // true
    scan.nextInt()        // Считываем число и не помещаем никуда
    print(scan.hasNext()) // false - числа на вход закончились.
}

