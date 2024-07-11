class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        var count: MutableMap<Int, MutableList<Int>> = mutableMapOf()
        var answer: MutableList<Int> = mutableListOf()
        for(x in nums1)
        {
            if(count.getOrElse(x){-1}==-1)
            {
                count.put(x, mutableListOf(1))
            }
        }
        for(x in nums2)
        {
            if(count.getOrElse(x){-1}==-1)
            {
                count.put(x, mutableListOf(2))
            }
            else{
                if(count[x]!!.count {it==2}==0){
                    count[x]!!.add(2)}
            }
        }
        for(x in nums3)
        {
            if(count.getOrElse(x){-1}==-1)
            {
                count.put(x, mutableListOf(3))
            }
            else{
                if(count[x]!!.count {it==3}==0){
                    count[x]!!.add(3)}
            }
        }
        for((key,value) in count)
        {
            if(value.size>1)
            {
                answer.add(key)
            }
        }
        return answer
    }
}