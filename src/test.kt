import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


//#10250
fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val testCase = br.readLine().toInt()
    for (i in 0 until testCase) {

        var inf = br.readLine().split(" ")
        var roomNum :String
        // inf[0] : 층수 , inf[1] : 방 수 , inf[2] : 몇번째손님
        var floor:Int
        var room:Int

        when(inf[2].toInt() % inf[0].toInt()){
            0->{
                floor=inf[0].toInt()
                room=inf[2].toInt() / inf[0].toInt()
            }
            else->{
                floor=inf[2].toInt() % inf[0].toInt()
                room=inf[2].toInt() / inf[0].toInt() + 1
            }
        }

        roomNum = "$floor${
            if (room < 10) "0$room"
            else "$room"
        }"
        bw.write("$roomNum\n")
        bw.flush()

    }

    br.close()
    bw.close()

}

/*
T : 테스트 케이스 수,
H(층 수), W(방 수), N(몇번째 손님)

  가장짧은거리방
  엘리베이터 가장 왼쪽
  HxW 형태 호텔
  두 방사이의 거리=1
  방번호 :층수,엘베부터 세었을때 번호
  걷는 거리가 같을때는 아래층방선호
  첫번째 101 ->201
 */

