package chap03.section5

fun main() {
    //일반 포현법
    // val multi = 3.multiply(10)

    //중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")
}

//Int를 확장해서 multiply() 함수를 하나 추가함
infix fun Int.multiply(x: Int): Int{
    return this*x
}