package chap05.section2.secondary

import chap05.section1.define.Bird

class Bird{
    // 프로퍼티-선언만함
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 부 생성자-매개변수를 통해 초기화할 프로퍼티에 지정
    /*constructor(name:String, wing: Int, beak:String, color: String){
        this.name=name  //this.name은 선언된 현재 클래서의 프로퍼티를 나타냄
        this.wing=wing
        this.beak=beak
        this.color=color
    }*/

    constructor(_name:String, _wing: Int, _beak:String, _color: String){
        name=_name  // _를 매개변수에 사용하고 프로퍼티에 this를 생략할 수 있음
        wing=_wing
        beak=_beak
        color=_color
    }

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int)=println("Sing vol: $vol")
}


fun main() {
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}