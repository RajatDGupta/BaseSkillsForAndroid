
class Solution {

    fun removeElement(nums: IntArray, num: Int): Int {
        var count=0
        for(item in nums){
            if(item!=num){
                count++
            }
        }
        return count
    }
}

fun main(){
   val c= Solution().removeElement(intArrayOf(0,1,2,2,3,0,4,2),2)
    print(c)
}




