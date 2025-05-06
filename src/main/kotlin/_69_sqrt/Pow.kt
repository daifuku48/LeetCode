package _69_sqrt

class Solution {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x

        var left = 1
        var right = x / 2
        while (left <= right) {
            val mid = left + (right - left) / 2
            val midSq = mid.toLong() * mid

            when {
                midSq == x.toLong() -> return mid
                midSq < x -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return right
    }
}