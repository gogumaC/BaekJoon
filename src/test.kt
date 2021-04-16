import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger


//#1978
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val N=br.readLine().toInt()
    var nums=br.readLine().split(" ")

    var count=0

    for(n in nums){

        if (n.toInt()!=1&&checkNum(n.toInt())) count++
    }

    bw.write("$count")



    br.close()
    bw.close()



}

fun checkNum(n:Int):Boolean{

    for(div in 2 until n){
        if(n%div==0) return false
    }
    return true
}



/*
소수출력 프로그램
숫자개수 N<100
숫자<1000 자연수
->소수개수 출력

소수: 소인수가 자기랑 1밖에 없는 친구 (! 1은 소수아님 !)


엥 로직은 비슷한데 다른사람들보다 꽤 오래 걸린다-> 아마 자료 입출력에서 시간이 걸리나보당,,
 */

