import java.io.*

//#2447
fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    //bw.write(square(br.readLine().toInt())) -> 배열이 훨빨랐다,,
    var array=getResult(br.readLine().toInt())
    for(i in array){
        bw.write("$i\n")
    }

    br.close()
    bw.close()

}

fun square(input:Int):String {

    if (input == 3) return "***\n* *\n***"


    //4는공백


    var result = ""

    val splitMini = square(input / 3).split("\n")
    for (j in 0 until splitMini.size) {
        if (splitMini[j] == "") continue
        result += splitMini[j] + splitMini[j] + splitMini[j]
        result += "\n"

    }

    val midLine = result.split("\n")
    var midresult = ""
    for (i in midLine.indices) {
        if(midLine[i]=="")continue
        midresult += midLine[i].replaceRange(input / 3.. 2 * input / 3 - 1, " ".repeat(input/3))

        midresult += "\n"
    }





    return result + midresult + result

}


fun getResult(input:Int):Array<String>{ //배열이용 ->훨씬 빠름

    if(input==3) return arrayOf("***","* *","***")

    val mini=getResult(input/3)
    val array=Array(input){""}


    for(i in 0 until input/3){
        array[i]=mini[i].repeat(3)
    }
    for(i in input/3 until 2*input/3){
        array[i]=mini[i%(input/3)]+" ".repeat(input/3)+mini[i%(input/3)]

    }
    for(i in 2*input/3 until input){
        array[i]=array[i-2*input/3]
    }

    return array
}



/*
가운데 사각형(N/3*N/3)을 N/3 패턴으로 둘러쌈
*/