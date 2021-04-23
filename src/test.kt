import java.io.*
import kotlin.math.absoluteValue
import kotlin.math.sqrt



//#10870
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    bw.write("${pibo(br.readLine().toInt())}\n")
    br.close()
    bw.close()

}

fun pibo(count:Int):Int{
    if(count==1)return 1
    else if(count==0) return 0
    val piboNum=pibo(count-1)+pibo(count-2)
    return piboNum
}




/*
피보나치 수
0 1 |1 2
*/