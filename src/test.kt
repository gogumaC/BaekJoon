import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt


//#4948
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))


    while(true){
        var n=br.readLine().toInt()
        if(n==0)break
        var count=getPrimes(n)
        bw.write("$count\n")
        bw.flush()

    }
    br.close()
    bw.close()

}



fun getPrimes(n:Int):Int{
    var count=0
    go@ for(num in n+1..2*n){
        for(i in 2..sqrt(num.toDouble()).toInt()){
            if(num%i==0) continue@go
        }
        count++
    }
    return count
}

//에라토리스 체 너무 오래걸림
//다른 사람들은 범위 사용해서 미리 입력값 범위까지 프라임 먼저 구해놓고 출력만 하는식으로 구현