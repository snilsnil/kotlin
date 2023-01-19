package chap03.section3

fun main() {
    val out: ()->Unit={println("hello world!")}

    out()
    val new = out
    new()
}