package zig_zag_conversion_6

class ZigZagConversion {
    fun convert(s: String, numRows: Int) : String{
        if (numRows== 1) return s
        var res = ""
        for (r in 0 until numRows) {
            val increment = (numRows - 1) * 2
            for (i in r until s.length step increment)
            {
                res += s[i]
                if (r > 0 && r < numRows - 1 && i + increment - 2 * r < s.length){
                    res += s[i + increment - 2 * r]
                }
            }
        }
        return res
    }
}