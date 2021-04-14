import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger


//#10757
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))


    val nums=br.readLine().split(" ")
    val sum=bigInteger(nums)


    bw.write("${sum}")


    br.close()
    bw.close()
}

fun bigInteger(nums:List<String>): BigInteger {
    val sum=nums[0].toBigInteger()+nums[1].toBigInteger()
    return sum
}

//fun double(nums: List<String>):String{ //끝까지 출력 못한다ㅜㅜ
//    val sumString=(nums[0].toDouble()+nums[1].toDouble()).toString()
//    println(sumString)
//    var newSum=sumString.split("E")
//    var sum=newSum[0].replace(".","")
//
//    println("float : ${sum}")
//    return ""
//}


//다른사람은 배열로 출력해냄! 대단..!

/*
    a,b입력 ->a+b출력
 */

