package _1_Two_Sums


class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf(-1, -1)
    }
}

fun main()
{
    val answer = Solution()
    answer.twoSum(intArrayOf(3,54,5,), 3)
}
