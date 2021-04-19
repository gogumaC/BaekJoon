import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt


//#9020
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))


    val primes=get10000Primes()

    for(case in 0 until br. readLine().toInt()){

        var n=br.readLine().toInt()
        var half=n/2
        while(true){

            if(primes[half]&&primes[n-half]) {
                bw.write("$half ${n-half}\n")
                break
            }
            half--
        }

        bw.flush()



    }



    br.close()
    bw.close()

}

fun get10000Primes():Array<Boolean>{
    val n=10000
    var array=Array<Boolean>(n+1,{true})
    array[0]=false
    array[1]=false

    for(num in 2..sqrt(n.toDouble()).toInt()){
        var i=2
        if(array[num]){
            while(num*i<=n){
                array[num*i]=false
                i++
            }
        }

    }
    return array
}


/*
골드바흐 추측 : 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼수있다.

n:2보다 큰 짝수
결과 많을때는 차이 적게나는걸로

소수

1안 : 앞 소수부터 순서대로 더해서 찾기
2안 : 가장가까운 소수부터 빼기
*3안 : 가운데 부터 양쪽 소수 더해서 찾기

걍 boolean배열이나 숫자만 있나 별 차이없었음
다른사람은 나처럼 두개 수를 따로 조작한게 아니라 half랑 n-half랑 둘다 참이면 걍 통과 아니면 half-- 해서 숫자하나만 써서 구현
이게 나처럼 증가하는 로직 하나 감소하는 로직하나 짜는것보다 훨간단하고 가독성도 좋은듯
 */
