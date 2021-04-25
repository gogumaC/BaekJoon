import java.io.*

//#11792
private val bw=BufferedWriter(OutputStreamWriter(System.`out`))
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))


    var input=br.readLine().toInt()
    bw.write("${hanoi(input)}\n")
    hanoiOrder2(input,1,3,2)
    br.close()
    bw.close()

}

fun hanoi(input:Int):Int{

    if(input==1)return 1
    val count=Math.pow(2.0,input.toDouble())-1

    return count.toInt()
}

fun hanoiOrder(input:Int,from:Int,to:Int,via:Int) :String{



    if (input == 1) {
        return "$from $to\n"
    }
    var result=""
    result+=hanoiOrder(input - 1, from, via, to)
    result+="$from $to\n"
    result+=hanoiOrder(input - 1, via, to, from) //다시탑

    return result
}

fun hanoiOrder2(input:Int,from:Int,to:Int,via:Int){



    if (input == 1) {
        bw.write("$from $to\n")
    }else{
        hanoiOrder2(input - 1, from, via, to)
        bw.write("$from $to\n")
        hanoiOrder2(input - 1, via, to, from) //다시탑
    }

}





/*

하노이의 탑

가장아래꺼를 3번기둥 -> 원래형태로 재귀
*/