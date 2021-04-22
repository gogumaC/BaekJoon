import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.absoluteValue
import kotlin.math.sqrt



//#10872
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val result=getFac(br.readLine().toInt()).toString()
    bw.write(result)

    br.close()
    bw.close()

}

fun getFac(input:Int):Int{
    if (input==0)return 1
    var result:Int
    if(input==1) return 1
        result=input*getFac(input-1)


    return result
}




/*

*/