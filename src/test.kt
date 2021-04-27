import java.io.*

//#1018

fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val (n,m)=br.readLine().split(" ")
    val bord=Array(n.toInt()){""}

    for(i in bord.indices){
        bord[i]=br.readLine()

    }



    bw.write("${getState(n.toInt(),m.toInt(),bord)}")


    br.close()
    bw.close()
}


fun getState(n:Int,m:Int,bord:Array<String>):Int{
    val whiteBord=arrayOf("WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW")
    val blackBord=arrayOf("BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB")
    var min=64
    for(ver in 0 .. n-8){
        for(hor in 0 .. m-8){
            var wcount=0
            var bcount=0
            for(i in ver until ver+8){
                for(j in hor until hor+8){
                    if(whiteBord[i-ver][j-hor]!=bord[i][j]) wcount++
                    if(blackBord[i-ver][j-hor]!=bord[i][j]) bcount++
                }
            }
            if(wcount<min)min=wcount
            if(bcount<min)min=bcount

        }
    }
    return min
}





/*

*/