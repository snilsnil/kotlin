package chap05.section3.override

import chap05.section3.openclass.Parrot


// 상속 가능한 클래스를 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // 메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int)=println("Sing vol: $vol")
}

class Parrot(name: String,
             wing: Int = 2,
             beak: String,
             color: String, // 마지막 인자만 var로 선언되어 프로퍼티가 추가되었음을 알 수 있음
             var language: String = "natural") : Bird(name, wing, beak, color) {

    fun speak()=println("Speak! $language") // Parrot에서 추가된 메서드
    override fun sing(vol: Int){ // 오버라이딩된 메서드
        println("I`m a parrot! The voume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5) //달라진 메서드 실행 가능
}