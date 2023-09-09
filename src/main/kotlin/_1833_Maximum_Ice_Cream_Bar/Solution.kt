package _1833_Maximum_Ice_Cream_Bar

class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        var value = 0
        var coinsOfIceCream = coins
        costs.sort()
        for (cost in costs){
            if (cost > coinsOfIceCream) break
            value += 1
            coinsOfIceCream -= cost
        }
        return value
    }
}