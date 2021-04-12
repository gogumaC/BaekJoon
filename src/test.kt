import java.io.*
import java.lang.IndexOutOfBoundsException

fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val N=br.readLine().toInt()

    for(n in 0 until N) {
        val input=br.readLine().split(" ")
        val R=input[0]
        val S=input[1]

        for (s in S) {
            for (i in 0 until R.toInt()) { //while에서는 바로 i선언 못하나;
                bw.write("$s")
            }
        }
        bw.write("\n")
        bw.flush()
    }

    br.close()
    bw.close()
}