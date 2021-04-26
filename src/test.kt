import java.io.*

//#2231

fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val case=br.readLine().toInt()
    val bigs=Array(case,{Big(0,0)})
    for(i in 0 until case){
        val (w,h)=br.readLine().split(" ")
        bigs[i].w=w.toInt()
        bigs[i].h=h.toInt()
    }

    bw.write("${getRank(bigs)}")

    br.close()
    bw.close()
}

fun getRank(bigs:Array<Big>):String{
    var result=""
    for(i in bigs.indices){
        var tempCount=0
        for(j in bigs.indices){
            if(bigs[i].w<bigs[j].w&&bigs[i].h<bigs[j].h) tempCount++
        }
        if(i==bigs.size-1){result+="${tempCount+1}"}
        else result+="${tempCount+1} "
    }
    return result
}

data class Big(var w:Int,var h:Int)





/*

*/