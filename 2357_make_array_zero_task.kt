class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var steps_count : Int = 0
        while(true)
        {
            var max_element : Int = nums.max()
            for( x in nums)
            {
                if (x >0 && x<max_element)
                {
                    max_element=x
                }
            }
            if(max_element<=0)
            {
                break
            }
            for(i in 0..nums.size-1)
            {
                nums[i]-=max_element
            }
            steps_count++
        }
        return steps_count
    }
}