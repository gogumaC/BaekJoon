import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

val PI=3.1415926535897932384626433832795028841971693993751058209

//#3053
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val rad=br.readLine().toInt()
    var euclid=rad*rad*PI
    var taxi=rad*rad*2.000000
    bw.write("$euclid\n$taxi")

    br.close()
    bw.close()

}








/*
두점사이거리
    유클리드 기하학 : sqrt((x2-x1)^2+(y2-y2)^2)
    택시 기하학 : |x1-x2|+|y1-y2|

입력 :반지름
출력 : 각 방법으로의 원의 넓이 :
 유클리드 :R^2*pi
 택시기하학 : 원이 마름모꼴로 나오게 됨->R^2*2


 ->나중에 string.format사용해서 값 더 깔끔하게 만들수 있을듯
*/
