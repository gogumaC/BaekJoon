import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


//#2775
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    for(i in 0 until br.readLine().toInt()){
        val floor=br.readLine().toInt()
        val room=br.readLine().toInt()
        var people=Array(floor+1, {Array(room,{0})})
        // bw.write("${calPeople(floor,room)}\n")
        bw.write("${calArray(people)[floor][room-1]}\n")
        bw.flush()

    }

    br.close()
    bw.close()


}

fun calPeople(floor:Int,room:Int):Int{  //재귀함수 이용 ->오래걸림
    var people=0
    if(floor==0){
        people=room
    }
    else {
        for (r in 1..room) {
            people+= calPeople(floor - 1, r)
        }
    }
    return people
}

fun calArray(people:Array<Array<Int>>):Array<Array<Int>>{ //2차원 배열사용
    for(i in people[0].indices){
        people[0][i]=i+1
    }

    for(i in people.indices) people[i][0]=1

    for(i in 1 until people.size){
        //p(f,r)=p(f,r-1)+p(f-1,r)
        for(j in 1 until people[i].size){
            people[i][j]=people[i][j-1]+people[i-1][j]
        }
    }

    return people
}

/*
테스트케이스
k층 n호->아래층 1~b호까지 사람들의 수의 합만큼 사람을 데려와 살아야함

0층 i명
 */

