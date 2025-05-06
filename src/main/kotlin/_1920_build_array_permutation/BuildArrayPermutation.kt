package _1920_build_array_permutation

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val original = nums.copyOf()  // создаём копию
        for (i in nums.indices) {
            nums[i] = original[original[i]]
        }
        return nums
    }
}

fun main() {
    val solution = Solution()
    solution.buildArray(intArrayOf(0, 1, 4, 3, 4, 5, 2, 3)).map { print("$it ") }
}