import java.io.*

//#1018

fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val n=br.readLine().toInt()
    //666 1666 2666 3666 4666 5666 6660~6669 7666 8666 9666 10666 11666 12666 13666 14666 15666 16660~16669 17666

    bw.write("${oneone(n)}")


    br.close()
    bw.close()
}

fun oneone(n:Int):Int{
    var count=0
    var num=666
    while(true){
//        if(six(n)) count++ -> 두배로 느림;;
        if(num.toString().contains("666")) count++
        if(count==n)break
        num++
    }
    return num
}

fun six(n:Int):Boolean{
    var six=0
    var num=n
    for(i in 0 until n.toString().length) {

        if (num % 10 == 6) six++
        else six = 0
        if(six==3)return true

        num /= 10

    }
    return false
}





/*

*/