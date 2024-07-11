class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var index : Int = 0
        while(true)
        {
            var tmp : Int = nums.max()
            for( x in nums)
            {
                if (x >0 && x<tmp)
                {
                    tmp=x
                }
            }
            if(tmp<=0)
            {
                break
            }
            for(i in 0..nums.size-1)
            {
                nums[i]-=tmp
            }
            index++
        }
        return index
    }
}