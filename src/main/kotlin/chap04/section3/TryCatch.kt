package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c: Int
    
    try {
        c=a/b //0으로 나눔
    }

    /*catch (e:Exception){
        println("Exception is handled.")
    } */

    // 산술 연상에 대한 특정 예외 처리
    /*catch (e:ArithmeticException){
        println("Exception is handled. ${e.message}")
    }*/

    //스택의 추적
    catch (e:Exception){
        e.printStackTrace()
    }

    finally {
        println("finally 블록은 반드시 항상 실행")
    }
}