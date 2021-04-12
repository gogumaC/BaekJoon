import java.io.*

fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val word=br.readLine()
    var alphbet=Array(26,{0})
    val alphbets="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(char in word){
        if(char>='A'&&char<'a'){    //소문자일때
            alphbet[char-'A']++
        }
        else{   //대문자일때 ,왜인지는 모르겠지만 if else는 안써짐;;ㅜㅜ else if인가..?
            alphbet[char-'a']++
        }
    }

    try {
        bw.write("${alphbets[getMax(alphbet)]}")
    }catch(e:IndexOutOfBoundsException){
        bw.write("?")
    }

    br.close()
    bw.close()

}

fun getMax(alphbet:Array<Int>):Int{
    var max=0
    var maxcount=0
    var result=0
    for(i in 0 until alphbet.size){
        if(alphbet[i]>max) {
            max = alphbet[i]
            result=i
        }
    }

    for(i in alphbet){
        if(i==max) maxcount++
    }
    if(maxcount>1) result=100
    return result
}

/*
 필요기능
  최댓값기능
  문자 구분 ->오옹 아스키코드로 걍 해버리자 z-a Z-A 같으니까 이거로 같은 문자도 구분 가능할듯
  문자 세기
 */