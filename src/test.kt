import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger


//#2581
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val M=br.readLine().toInt()
    val N=br.readLine().toInt()


    bw.write("${checkNum(M,N)}")



    br.close()
    bw.close()



}

fun checkNum(m:Int,n:Int):String{

    var min=n
    var total=0
    go@ for(num in m..n){
        if(num!=1) {
            for (div in 2..num - 1) {
                if (num % div == 0) {
                    continue@go
                }
            }
            if (num < min) min = num
            total += num
        }
    }



    return if(total==0)"-1" else "$total\n$min"
}



/*
M<=X<=N 에서 소수찾아서 최솟값 출력하기
없으면 -1
 */

