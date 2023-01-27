package chap04.section1

fun main() {
    print("Enter the score: ")
    val score= readLine()!!.toDouble() // 콘솔로부터 입력받음
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
   /* } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >= 70.0 && score <= 79.9) {
        grade = 'C'
    }*/
    } else if (score in 80.0 .. 89.9) { // AND 연산자 대신 in 연산자로 범위 지정
        grade = 'B'
    } else if (score in 70.0 .. 79.9) { // AND 연산자 대신 in 연산자로 범위 지정
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}