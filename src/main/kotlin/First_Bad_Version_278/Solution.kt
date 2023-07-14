package First_Bad_Version_278


class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        if (n == 1) return 1
        var end = n
        var start = 1

        while (start <= end) {
            var mid = start + ((end - start) / 2)
            if (!isBadVersion(mid)) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return start
    }
}