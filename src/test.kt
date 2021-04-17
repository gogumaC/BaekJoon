import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger


//#11653
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val N=br.readLine().toInt()
    var result=check(N)//"${checkPrimeFac(N,findPrimNum(N))}"
    bw.write(result)

    br.close()
    bw.close()



}


fun check(N:Int):String {
    var result = ""
    var divN = N

    if(N==1)return ""

    go@ while (divN!=1) {

        for (i in 2 until divN) {
            if (divN % i == 0) {
                result += "$i\n"
                divN = divN / i
                continue@go
            }
        }
        if(divN!=1){
            result+=divN
            divN=1
        }

    }

    return result
}


/*
소인수분해
 정수N
 1.1~N까지 소수찾기
 1-2.만약 N이 소수면 N을출력, 1이면 출력하지 않기
 2. 찾은 소수를 돌아가면서N을나누고 나눠지면 div=div*찾은소스,br.write에  찾은숫자 \n입력, N/div해서 반복

 -->이거 너무 오래걸림->시간초과
 */

