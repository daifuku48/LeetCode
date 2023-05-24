package _66_Plus_One

class Solution {
    fun plusOne(digits: IntArray) : IntArray {
        val n: Int = digits.size
        for (i in n - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }

        val newNumber = IntArray(n + 1)
        newNumber[0] = 1
        return newNumber
    }
}

fun main()
{
    val solution = Solution()
    solution.plusOne(intArrayOf(1,3,3,4))
}
