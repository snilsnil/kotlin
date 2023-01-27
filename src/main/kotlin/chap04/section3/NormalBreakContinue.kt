package chap04.section3

fun main() {
    //break
   /* for(i in 1..5){
        //if (i==3) break
        if (i==3) continue
        print(i)
    }
    println()
    println("outside")*/

    //라벨을 사용하여 break
 /*   println("labelBreak")
    for(i in 1..5){
        second@ for (j in 1..5){
            if (j == 3) break
            println("i:$i, j:$j")
        }
    }*/
    
    // break에 @first 사용
    /*println("labelBreak")
    first@ for(i in 1..5){
        second@ for (j in 1..5){
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
    }*/
    
    //continue에 @first 사용
    println("labelBreak")
    first@ for(i in 1..5){
        second@ for (j in 1..5){
            if (j == 3) continue@first
            println("i:$i, j:$j")
        }
    }
    println("after for i")
}