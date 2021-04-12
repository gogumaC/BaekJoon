import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br= BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val wordList=br.readLine().split(" ")
    var wordCount=0
    for(word in wordList){
        if(word !="")wordCount++
    }
    bw.write("$wordCount") //이거 ""안씌우고 돌렸더니 이상한문자가 나왔당;;
    bw.flush()
    //println(wordCount)
    bw.close()
    br.close()
}

//코드는 길어져도 buffer사용하는게 컴파일시간 단축됨