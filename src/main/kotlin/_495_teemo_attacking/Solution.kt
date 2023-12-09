package _495_teemo_attacking

class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var time = 0
        for (i in timeSeries.indices) {
            if (i != timeSeries.size - 1) {
                val attackInterval = timeSeries[i + 1] - timeSeries[i]
                time += if (attackInterval > duration) {
                    duration
                } else {
                    attackInterval
                }
            } else {
                time+=duration
            }
        }
        return time
    }
}


//1, 5, 7, 8            3