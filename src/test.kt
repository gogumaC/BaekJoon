import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val N=br.readLine().toInt()
    val words=Array(N,{br.readLine()})  //호옹이!!! 혁명이다!!!
    var count=0

    for(i in 0 until N){
        if(checkGroup(words[i]))count++
    }
    bw.write("$count")

    bw.flush()
    br.close()
    bw.close()
}

fun checkGroup(word:String):Boolean{

    var letters = ""
    for(j in word.indices) {
        //aabbcca
        try {
            if (word[j - 1] != word[j]) {
                if (!letters.contains(word[j])) letters += word[j]
                else {
                    return false
                }
            }


        } catch (e: StringIndexOutOfBoundsException) {
            letters += word[j]
        }
    }
    return true
}

/*
1.단어개수받기
2. 단어받기
3. 그룹단어 구분- 같은문자가 떨어져있으면 그룹단어아님
    -어떤 글자 있었는지 기억해야됨
    [1안] 1. 나온글자 안겹치게 다른 변수에 순서대로저장(앞뒤 글자 같은경우는 미리 조건문으로 제거)
            2.앞에 글자같은지 확인(뒤에 또시작하는 애들은 어차피 앞에가 항상 다를테니까)
            3. 안똑같으면 letter에 글자있는지 확인 contain
            4. 없으면 걍 넘어가고 있으면 카운트 증가
4.출력
 */