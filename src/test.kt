import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){

    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val nums=br.readLine().split(" ")
    //nums[0],nums[1]이 각각의 숫자

    val n1=changeNums(nums[0]).toInt()
    val n2=changeNums(nums[1]).toInt()

    bw.write("${compareNums(n1, n2)}")

    br.close()
    bw.close()
}

fun changeNums(num:String):String{
    var reverseNum=""

    for(i in 1 .. 3){
       // reverseNum[i]=num[3-i] 엥 이게 왜 안돼누,,
        reverseNum+=num[3-i]
    }
    return reverseNum
}

fun compareNums(n1:Int,n2:Int):Int{
    if(n1>n2) return n1
    else return n2
}
/*
1. 두수 받기 (버퍼)
2.
3. 숫자 위치바꾸는 함수 구현
4. 출력
 */