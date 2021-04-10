import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val inf=br.readLine().split(" ")

    var n=findBreakEvenPoint(inf[0].toLong(), inf[1].toLong(), inf[2].toLong())
    bw.write("$n")
    bw.flush()
    bw.close()
    br.close()


}

fun findBreakEvenPoint(fixCost:Long,flexibleCost:Long,price:Long):Long{

    if(price>flexibleCost) {
        var n=fixCost/(price-flexibleCost)
        return n+1
    }
    else return -1


}
/*
고정비용A ,가변비용B , 판매가격C, 판매대수 N
손익분기점 : 총수입(C*N)=고정비용A+B*N
없으면 -1출력

[다른답안 참고] : 하나씩 올리면 시간이 어마무시하게 걸리니까 수식을 써야된다!
 손익분기점 -> 실제얻는 소득(가변비용-고정비용)*N=고정비용
  따라서 (C-B)*N=A  -> N=A/(C-B)!
 */