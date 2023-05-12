package spiral_matrix_53

import java.util.Arrays

interface Solution{
    fun spiralOrder(matrix: Array<Array<Int>>): List<Int>
    class Base : Solution {
        override fun spiralOrder(matrix: Array<Array<Int>>): List<Int> {
            val R = matrix.size
            val C = matrix[0].size
            var up = 0
            var down = R
            var left = 0
            var right = C
            val res = mutableListOf<Int>()

            while (true){
                for (i in left until right)
                    res.add(matrix[up][i])
                up++
                for (i in up until down)
                    res.add(matrix[i][right-1])
                right--
                if (res.size == R * C) break
                for (i in right-1 downTo left)
                    res.add(matrix[down-1][i])
                down--
                for (i in down-1 downTo up)
                    res.add(matrix[i][left])
                left++
                if (res.size == R * C) break
            }
            return res
        }
    }
}


fun main()
{
    val list = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(7, 8, 9, 10)
    )

    val solution = Solution.Base()
    val listArray = solution.spiralOrder(list)
    for (i in listArray)
        print("$i ")
}
