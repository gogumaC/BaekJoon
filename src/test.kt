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


    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val word=br.readLine()
    //val dial=arrayOf("","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ","")
    var time=0
    for(w in word){

        when(w){

            in 'A'..'C'->time+=3
            in 'D'..'F'->time+=4
            in 'G'..'I'->time+=5
            in 'J'..'L'->time+=6
            in 'M'..'O'->time+=7
            in 'P'..'S'->time+=8
            in 'T'..'V'->time+=9
            in 'W'..'Z'->time+=10

        }
    }
    bw.write("$time")
    bw.flush()


    bw.close()
    br.close()

}
/*
이 단어 최소시간
1. 단어받기
2.단어에 해당하는 숫자데이터만들기 (문자열로 배열만들자!)
3.최소시간 구하기

 */

/*
??배열이나 컬랙션에서 값알때 인덱스 어케찾을까??

 */