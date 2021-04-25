import java.io.*

//#2798

fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val (cardNum,max)=br.readLine().split(" ")
    val cards=br.readLine().split(" ")

    var maxNum=0
    for(c1 in 0 until cardNum.toInt()-2){
        for(c2 in c1+1 until cardNum.toInt()-1){
            for(c3 in c2+1 until cardNum.toInt()) {
                var sum =cards[c1].toInt() + cards[c2].toInt() + cards[c3].toInt()
                        if (sum <= max.toInt()) {
                            if (sum > maxNum) maxNum = sum
                        }
            }


        }
    }


    bw.write("$maxNum")
    bw.close()
    br.close()


}





/*
합배열
M보다 큰값 조건문으로 제거
남은거중에서 최댓값
*/