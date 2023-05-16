package _48_rotate_image

import sort_list_148.Solution

class SolutionRotateImage {
    fun rotate(matrix: Array<IntArray>){
        val m = matrix.size
        val n = matrix[0].size

        for (row in 0 until m){
            for(col in row until n){
                //swap
                matrix[row][col] = matrix[col][row].also{
                    matrix[col][row] = matrix[row][col]
                }
            }
        }

        for(row in 0 until m){
            var start = 0
            var end = n-1
            while(start<=end){
                //swap
                matrix[row][start] = matrix[row][end].also{
                    matrix[row][end] = matrix[row][start]
                }
                start++
                end--
            }
        }
    }
}

