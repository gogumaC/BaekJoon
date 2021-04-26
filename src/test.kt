import java.io.*

//#2231

fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    bw.write("${getMinCons(br.readLine().toInt())}")

    br.close()
    bw.close()
}

fun getMinCons(n:Int):Int{

//999->999+9+9+9->1026
    for(num in n-(n.toString().length)*9 until n){
        var cons=num
        num.toString().forEach{
            cons+=it-'0'
        }

//        for(i in numString){
//            cons+=i-'0'
//        }

        if(cons==n) return num
    }
    return 0
}





/*

*/