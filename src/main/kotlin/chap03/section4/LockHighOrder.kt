package chap03.section4

import java.util.concurrent.locks.ReentrantLock


var sharalbe=1 // 보호가 필요한 공유 자원

fun main() {
    val reLock=ReentrantLock()
    
    //1, 2, 3번 표현식이 모두 동일
    lock(reLock, { criticalFunc()}) // 1번
    lock(reLock) { criticalFunc()}  // 2번
    lock(reLock,  ::criticalFunc)   // 3번

    println(sharalbe)

}

fun criticalFunc(){
    // 공유 자원 접근 코드 사용
    sharalbe+=1
}

fun <T> lock(reLock: ReentrantLock, body:()->T):T{
    reLock.lock()
    try {
        return body()
    }finally {
        reLock.unlock()
    }
}