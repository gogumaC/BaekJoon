import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.absoluteValue
import kotlin.math.sqrt



//#1002
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    for(t in 0 until br.readLine().toInt()){
        bw.write(getPointNum(br.readLine()))
        bw.flush()
    }
    br.close()
    bw.close()

}

fun getPointNum(input:String):String {
    val inputList = input.split(" ")
    val x1 = inputList[0].toInt()
    val y1 = inputList[1].toInt()
    val r1 = inputList[2].toDouble()
    val x2 = inputList[3].toInt()
    val y2 = inputList[4].toInt()
    val r2 = inputList[5].toDouble()

    val pointsDistance = sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)).toDouble())
    when {
        pointsDistance == 0.0&&r1==r2 -> return "-1\n"
        pointsDistance > (r1 + r2)||pointsDistance<(r2-r1).absoluteValue-> return "0\n"
        pointsDistance == (r1 + r2)||pointsDistance==(r2-r1).absoluteValue -> return "1\n"
        pointsDistance < (r1 + r2)&&pointsDistance>(r2-r1).absoluteValue -> return "2\n"

        else ->return "err\n"
    }

}








/*

*/