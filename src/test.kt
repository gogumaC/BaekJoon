import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.IndexOutOfBoundsException
import java.math.BigInteger
import kotlin.math.sqrt


//#1929
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val (N,M)=br.readLine().split(" ")//.map { it.toInt() }

    var prime=eratos(M.toInt())
    for(num in N.toInt()..M.toInt()){
        if(prime[num]) bw.write("$num\n")
    }


    br.close()
    bw.close()

}



fun eratos(m:Int):BooleanArray{
    var primes=BooleanArray(m+1,{true})
    primes[1]=false

    //prime 구하기
    for( i in 2 .. sqrt(m.toDouble()).toInt()){
        if(primes[i]) {
            var j = i + 1

            while (j < primes.size) {
                if (j % i == 0) primes[j] = false
                j++
            }
        }

    }


    return primes
}

/*
소수 판별법
직접 나누기 (Trial Division)는 소수판별법 중에서 가장 간단한 예시로,
 어떤 수 N의 양의 제곱근 이하의 수들로 N을 나눠서 한 번이라도 나누어떨어지면 합성수, 아니면 소수라고 판정하는 방법이다.
 보통 다른 소수판별법을 하기에 앞서서 특정 범위까지 나눠 보는 방식으로 많이 사용되며,이 방법을 이용하여 어떤 수를 소인수분해할 수도 있다.
이 방법은 간단하고 편리하지만 다른 소수판별법 중에서 가장 비효율적인 방식에 속하며
 여러 소인수분해 방법들 중에서도 가장 비효율적인 방법에 속한다.

 -->요거 약간 업그레이드 해서 양의제곱근 이하의 소수들로만 한정해서 돌려봐야겠음
 ->근데 이거 new랑 합치면 그 사이에 있는거만 소수로 받아서 넣어지니까 앞에있는 소수들은 못쓰게됨;;
 일단 소수함에서 나누기 -> 다음에 1부터 나누기 ->여기도 없으면 소수함으로
 sqrt이하 수로 나눠지면 합성수->근데 sqrt이하도 어차피 소수로 이루어진것들일것이므로 sqrt이하 소수를 구해서 그걸로 나누기
 -> 나눠진거 있으면 아아아아앙
 일단 2제외 모든 짝수 거름 그 다음에 하면 두배는 빠를듯

 -->에라토리스의 체
 -->와 넘힘들어,, 이거만 한 5~6시간 했다ㅜ
 -->리스트로 프라임 보낼때 856ms  / Array로 프라임 보낼때 : 784ms
 --> Array<Boolean> 사용 : 784ms  / BooleanArray사용 : 800ms

 */

