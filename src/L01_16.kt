fun main(args: Array<String>) {
    val string = "and stars collide"
    println(string)
    println("!" + string.substringAfter("s") + "!")
    println("!" + string.substringAfterLast("s") + "!")
    println("!" + string.substringBefore("s") + "!")
    println("!" + string.substringBeforeLast("s") + "!")

    println()

    println("Hello".toUpperCase())
    println("Hello".toLowerCase())
    println()
    println("Kotlin one love <3")
    println("Kotlin one love <3".length)
}