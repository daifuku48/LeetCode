package _12_integet_to_roman

class Solution {
    fun intToRoman(num: Int): String {
        val ones = arrayOf("","I","II","III","IV","V","VI","VII","VIII","IX")
        val tens = arrayOf("","X","XX","XXX","XL","L","LX","LXX","LXXX","XC")
        val hundreds = arrayOf("","C","CC","CCC","CD","D","DC","DCC","DCCC","CM")
        val thouhands = arrayOf("","M","MM","MMM")
        return thouhands[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10]
    }
}