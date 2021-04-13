import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


//#2869
fun main(){

    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val input=br.readLine().split(" ")
    val day=input[0].toInt()
    val night=input[1].toInt()
    val tree=input[2].toInt()

    var days=0


    val gap=day-night
    val tempTree=tree-day
    if(tempTree%gap==0) days=(tempTree/gap)+1
    else days=(tempTree/gap)+2

    //일일히 비교 방법->이렇게하면 너무 오래걸림;;
//    while(true){
//        total+=day
//        if(tree<=total) break
//        else {
//            total -= night
//            days++
//        }
//    }

    bw.write("$days")



    br.close()
    bw.close()

}

/*
  나무높이 V, 낮이동 A , 밤후퇴 B
  하루에 총 이동한 거리 gap=A-B
  다음날이면 정상에 도착하는 거리 : V-A
  (V-A)%gap==0 -> 걸린날짜=(V-A)/gap+1
    else-> 걸린날짜->(V-A)/gap+2
 */

