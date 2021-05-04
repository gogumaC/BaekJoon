import java.io.*

//#2750

fun main() {
    val br=BufferedReader(InputStreamReader(System.`in`))
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val case=br.readLine().toInt()
    val nums=Array(case,{0})

    for(i in 0 until case){
       nums[i]=br.readLine().toInt()
    }
    upSort(nums).forEach{
        bw.write("$it\n")
    }
    br.close()
    bw.close()
}

fun upSort(nums:Array<Int>):Array<Int>{

    var temp:Int
    for(i in 0 until nums.size-1){
        for(j in i+1 until nums.size){
            if(nums[i]>nums[j]){
                temp=nums[i]
                nums[i]=nums[j]
                nums[j]=temp
            }
        }
    }
    return nums
}









/*

*/