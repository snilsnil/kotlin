package chap03.section1
/*
fun sum(a:Int, b:Int): Int{
    var sum=a+b
    return sum
}*/

fun sum(a:Int, b:Int)=a+b //위 주석처리된 함수의 축약형

fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)
}
