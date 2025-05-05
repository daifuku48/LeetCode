package _28_Find_index

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (!haystack.contains(needle)) {
            return -1
        }

        val result = needle.toRegex().findAll(haystack).map { it.range.first }
            .toList()
        return if (result.isNotEmpty()) {
            result.first()
        } else -1
    }
}