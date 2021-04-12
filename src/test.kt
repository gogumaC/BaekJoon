import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


//#2292
fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val num=br.readLine().toInt()
    var stage=1 //반복문안에서 선언하면 메모리에 안좋을까..?


    while(true){   //걍 while안으로 안들어오는데;; -> 조건문제였음ㅜㅜㅜㅜ
        var n=1+3*stage*(stage-1)
        if(n>=num) break
        else stage++
    }

    //println(" n : $n , st: $stage")
    bw.write("$stage")


    br.close()
    bw.close()

}

/*
6각형
1+6+12+18...
--> 1+6*시그마k (k=1~stage까지)
-->등차수열공식 시그마k(k=1~n까지)=1/2*n*(n+1)
 */

