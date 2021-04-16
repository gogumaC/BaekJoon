import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger


//#1011
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))


    for (i in 0 until br.readLine().toInt()) {
        val (x, y) = br.readLine().split(" ")
        val count=getCount(x.toLong(),y.toLong())
        bw.write("${count}\n")
        bw.flush()


    }


    br.close()
    bw.close()
}

fun getCount(x:Long,y:Long):Long{
    val gap=y-x
    val halfGap=gap/2
    var halfCount=1L
    var tempUnder:Long
    var count=0L
    val total:Long
    if (gap==1L) return 1
    else {
        while (true) {
            tempUnder = halfCount * (halfCount + 1) / 2L
            if (tempUnder == halfGap) {
                total=2*tempUnder
                break
            } else if (tempUnder > halfGap) {
                total=2*(tempUnder-halfCount)
                halfCount--
                break
            }
            halfCount++
        }


        val rest=gap-total


        count+=when {
            rest==0L->0
            rest<=halfCount+1L->1
            rest>halfCount+1->2
            else->0

        }

        count += halfCount * 2



        return count
    }
}


/*
   테스트 케이스T / 현재위치 x , 목표위치 y (x<y)
   x=0 이동가능 +1
   x=1 이동가능 +1,2
   x=3 이동가능 +2,3,4
   ---
   마지막이동은 무조건 1

   처음 , 마지막 둘다 1로 끝나야하므로 낙타 봉우리모양 그래프로 속력을 표기가능/ 따라서 절반만 구해서 *2 하겠음 -> 예외있음(거리가 홀수일때)
   등비수열 k+1로 gap의 가장 가까운 바로 밑수까지 구하고 부족하면 중간에 더할수있으므로 count++
   -> 예를들어 절반 거리가 11일때 가장가까운 밑수는 1+2+3+4=10 이고, 문제 설명상 중간에 k->k로 이동해도 관계없으므로
     1+'1'+2+3+4=11로 중간에 1을 추가해서 거리 맞추고 count++
 */

