package chap05.section4.prisecon

class Person(firstName: String, 
             out: Unit = println("[Primary Constructor] Parameter")) { // 2번, 주 생성자
    
    val fName=println("[Property] Person fName: $firstName") // 3번, 프로퍼티 할당
    
    init{
        println("[init] Person init block") // 4번, 초기화 블록
    }
    
    // 1번, 부 생성자
    constructor(firstName: String, age : Int, 
                out: Unit = println("[Secondary Constructor] Parameter")):this(firstName){
        println("[Secondary Constructor] Body: $firstName, $age") // 5번, 부 생성자 본문
    }
}

fun main() {
    val p1 = Person("Kildong", 30) // 1번 -> 2번 호출, 3번 -> 4번 -> 5번 실행
    println()
    val p2 = Person("Dooly") // 2번 호출, 3번 -> 4번 실행
}