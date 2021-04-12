import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


//#1193
fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val num=br.readLine().toInt()
    var groupIndex=1
    var groupCount:Int
    while(true){
        groupCount=groupIndex*(groupIndex+1)/2

        if(num<=groupCount){
            bw.write(getFraction(num,groupIndex,groupCount))
            break
        }
        else groupIndex++
    }

    br.close()
    bw.close()

}
fun getFraction(n:Int,index:Int,count:Int):String{
    var order=n-(count-index) //count-index=precount
    //println(order)
    var numerator=if(index%2==0)order
                    else index-order+1
    var denominator=if(index%2==0)index-order+1
                    else order

    return "$numerator/$denominator"
}

/*
 분자 1/-1-2/-1-2-3/-1-2-3-4/-...
 분모 1/-2-1/-3-2-1/-4-3-2-1/-...

 등차수열 공식이용하면 (g=그룹 인덱스,그룹별 숫자 수)
 g그룹까지의 전체 개수= 1/2*g*(g+1)

 -->자기순서=n-그전 그룹까지의 개수
 분자 : (index짝수면)자기순서 (홀수면)역수
 ---------------------------------------
 분모 : (짝수면)그 그룹 인덱스(개수)-자기순서(홀수면)자기순서
 */

