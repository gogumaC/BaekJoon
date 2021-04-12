import java.io.*
import java.util.*
fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val S=br.readLine()
    //val alphabet="abcdefghijklmnopqrstuvwxyz" -->일케 안하고 걍 아스키코드 쓰자구
    var order= Array(26,{-1})


    for(i in 0 until S.length){ //i in S 이상태에서는 인덱스 못 가져오나;;?

        var alphbet=S[i]
        var index=alphbet-'a'
        if(order[index]==-1) {  //최초만 기록되야되니까 조건문 추가함; -1아니면 이미 한번 입력됬다는뜻이므로 여기서 걸러줌
            order[index] = i
        }
    }


    for(i in order){
        bw.write("$i ")
    }
    br.close()
    bw.close()
}