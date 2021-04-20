import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt


//#3009
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val n1=br.readLine().split(" ").map{it.toInt()}
    val n2=br.readLine().split(" ").map{it.toInt()}
    val n3=br.readLine().split(" ").map{it.toInt()}
    val x=findDif(n1[0],n2[0],n3[0])
    val y=findDif(n1[1],n2[1],n3[1])
    bw.write("$x $y")
    br.close()
    bw.close()

}

fun findDif(n1:Int,n2:Int,n3:Int):Int{
    when{
        n1==n2->return n3
        n2==n3->return n1
        n1==n3->return n2
        else ->return -1
    }
}




/*
  입력 : 세점의 좌표
  출력 : 네번째점의 좌표

  조건 : 축에 평행한 직사각형
  사고 : 같은수 각각 2개씩있어야하므로 없는거 출력 ->세 값 받아서 조건문써서 같으면 나머지하나 방출


  일일히 toInt()거는것보다 .map{it.toInt()}가 약간 더 오래걸리는듯,,
  그래도 원소 많을때는  .map()이 유용할듯
*/
