package chap02.section3

fun main() {
    var str1: String? = "hello"
    str1=null
    //println("str1:$str1 length:${str1!!.length}")
    val len = if(str1!=null) str1.length else -1
    println("str1: $str1 length: ${len}")
}