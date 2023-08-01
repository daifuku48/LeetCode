package _70_climbing_stairs

class Solution {
    fun climbStairs(n: Int): Int {
        val steps = IntArray(n + 1)
        steps[0] = 1
        steps[1] = 1
        for (step in 2 until steps.size){
            steps[step] = steps[step - 2] + steps[step - 1]
        }
        return steps[n]
    }
}