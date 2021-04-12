import java.util.*
import java.io.*

fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
   // val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val N=br.readLine()
    val nums=br.readLine()

    var total=0

    for(num in nums){
        total+=(num-'0').toInt()
    }
    println(total)
    br.close()
   // bw.close()
}