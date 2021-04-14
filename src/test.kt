import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


//#2775
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val flourMass=br.readLine().toInt()

    bw.write("${my(flourMass)}")

    br.close()
    bw.close()


}

fun my(flourMass:Int):Int{ //132ms
    var count=-1
    for(x in 0..flourMass/3) {
        if((flourMass-3*x)%5==0) {
            count = ((flourMass - 3 * x) / 5)+x
            break
        }
    }
    return count
}

fun otherPerson(flourMass:Int):Int{ //68ms
    var n =flourMass
    var count=0
    while(true){
        if(n%5==0){
            return n/5+count
            break
        }
        else if(n<=0){
            return -1
            break
        }
        n-=3
        count++
    }
}


/*

 */

