import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))
    val word=br.readLine()
    val croatia=arrayOf("c=","c-","dz=","d-","lj","nj","s=","z=")
    var newWord=word

    for(cro in croatia){
        if(word.contains(cro)){
            newWord=newWord.replace(cro,"c")
        }
    }


    bw.write("${newWord.length}")
    bw.flush()
    br.close()
    bw.close()
}

/*
1. 단어받음
2. 단어안에 각각의 크로아티아 알파벳 포함되있는지 확인
    [1안]
    첫번쨰 문자확인->두번째문자확인->세번쨰문자확인
    [2안]
    split으로 크로아티아 알파벳기준 문자열나누기
    [3안]
    !!!!.replace사용해서 대체하기!!!!

3. 있으면 그부분을 다른 하나의 문자로 변환
4. length로 알파벳세서 출력
 */