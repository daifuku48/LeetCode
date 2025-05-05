package _27_remove_element

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val array = nums.toMutableList()
        array.filter {
            it != `val`
        }
        return array.size
    }
}