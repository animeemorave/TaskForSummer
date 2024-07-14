class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        return (nums1.intersect(nums2.toList()) + 
                nums2.intersect(nums3.toList()) +
                nums3.intersect(nums1.toList())).toList()
    }
}