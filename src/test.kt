import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt


//#9020
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val (x, y, w, h) = br.readLine().split(" ")

    bw.write("${findMin(arrayOf(x.toInt(),y.toInt(),w.toInt()-x.toInt(),h.toInt()-y.toInt()))}")
    br.close()
    bw.close()

}

fun findMin(nums:Array<Int>):Int{
    var min=1000
    for(num in nums){
        if(num<min){
            min=num
        }
    }
    return min
}




/*
입력 : x y w h
출력 : 직사각형 경계면까지의 최소거리

위치가 (x,y)일때 직사각형까지 가는 4개의 직선거리는 x,y,w-x,h-y이므로 이 네개의 숫자중 최솟값을 구해서 출력
 */
