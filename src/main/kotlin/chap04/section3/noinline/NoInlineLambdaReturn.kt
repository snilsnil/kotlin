package chap04.section3.noinline

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline을 제거
    out(a, b)
}

/* // 1번
fun retFunc(){
    println("start of reFunc")
    inlineLambda(13, 3) lit@{ a, b->
        val result = a + b
        if(result>10) return@lit
        println("result: $result")
    }
    println("end of retFunc")
}*/

/* // 2번
fun retFunc(){
    println("start of reFunc")
    inlineLambda(13, 3) { a, b->
        val result = a + b
        if(result>10) return@inlineLambdaq
        println("result: $result")
    }
    println("end of retFunc")
}*/

// 3번
fun retFunc(){
    println("start of reFunc")
    inlineLambda(13, 3, fun(a, b) {
        val result = a + b
        if(result>10) return
        println("result: $result")
    })
    println("end of retFunc")
}
