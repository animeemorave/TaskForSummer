class Solution {
    fun minimumOperations(input_nums: IntArray): Int {
        var num_operation = 0
        var nums = input_nums.toMutableList()
        while (true) {
            val filtred_nums = nums.filter { it > 0 }
            if (filtred_nums.isEmpty()) {
                break
            }
            val min_element = filtred_nums.min()
            nums.replaceAll { it - min_element }
            num_operation++
        }
        return num_operation
    }
}