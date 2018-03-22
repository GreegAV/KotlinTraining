package Lesson1_14

fun main(args: Array<String>) {
    val a = "hello"
    a.toUpperCase()
    a.replace("e", "l")
    a.substring(3)
    a.replaceAfter("l", "OOOO")
    a.capitalize()
    a.toLowerCase()
    a.decapitalize()
    a.trim()
    a.replace(Regex("[A-z]"), "OLOLO")
    print(a)

}
