package _4_Median_Of_Two_Sorted_Arrays

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray) : Double {
        var i1 = 0
        var i2 = 0

        val newArray = IntArray(nums1.size + nums2.size)

        (0..newArray.lastIndex).forEach { i ->
            val n1 = if (i1 == nums1.size) null else nums1[i1]
            val n2 = if (i2 == nums2.size) null else nums2[i2]
            newArray[i] = when {
                n1 == null -> n2
                n2 == null -> n1
                n1 < n2 -> n1
                else -> n2
            }!!
            if (newArray[i] == n1) i1++ else i2++
        }
        ///

        val left = newArray.lastIndex / 2
        val right = (newArray.lastIndex + 1) / 2

        return (newArray[left] + newArray[right]) / 2.0
    }
}