package _58_lenght_of_last_word

class Solution {
    fun lengthOfLastWord(s: String) = s.removeSuffix("  ").removePrefix(" ").split(" ").last().length
}