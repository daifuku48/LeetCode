package _2706_Buy_Two_Chocolates

class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        prices.sort()
        val firstMin = prices[0]
        val secondMin = prices[1]
        if (firstMin + secondMin <= money){
            return money - firstMin - secondMin
        }
        return money
    }
}