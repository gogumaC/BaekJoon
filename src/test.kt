import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt


//#4153
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    while(true){
        var input=br.readLine().split(" ")
        if(input[0]=="0"&&input[1]=="0"&&input[2]=="0")break
        if(pita(input[0].toInt(),input[1].toInt(),input[2].toInt())) bw.write("right\n")
        else bw.write("wrong\n")
        bw.flush()
    }
    br.close()
    bw.close()

}

fun pita(n1:Int,n2:Int,n3:Int):Boolean{
    var nums= mutableListOf(n1,n2,n3)
    var temp:Int

    for(i in 0 until 3){
        for(j in i+1 until 3){
            if(nums[i]>nums[j]){
                temp=nums[i]
                nums[i]=nums[j]
                nums[j]=temp
            }
        }

    }

    if(nums[2]*nums[2]==nums[1]*nums[1]+nums[0]*nums[0]) return true
    return false

}






/*
피타고라스 정리사용 -> 다른 사람들은 조건문 사용해서 시간 줄인듯
*/
