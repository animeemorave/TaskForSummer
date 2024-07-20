class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var num_operation = 0
        while (true) {
            val filtred_nums = nums.filter { it > 0 }
            if (filtred_nums.isEmpty()) {
                break
            }
            val min_element = filtred_nums.min()
            for (index in nums.indices)/*
        Когда я пишу for(number in nums), number считается val
        и я не могу её менять(а очень хочется)
        */ {
                nums[index] -= min_element
            }
            num_operation++
        }
        return num_operation
    }
}