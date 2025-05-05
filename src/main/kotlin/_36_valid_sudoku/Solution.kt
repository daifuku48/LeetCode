package _36_valid_sudoku

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { mutableSetOf<Char>() }
        val cols = Array(9) { mutableSetOf<Char>() }
        val boxes = Array(9) { mutableSetOf<Char>() }

        for (i in 0..8) {
            for (j in 0..8) {
                val item = board[i][j]
                if (item == '.') continue

                val boxIndex = (i / 3) * 3 + (j / 3)

                if (item in rows[i] || item in cols[j] || item in boxes[boxIndex]) {
                    return false
                }

                rows[i].add(item)
                cols[j].add(item)
                boxes[boxIndex].add(item)
            }
        }

        return true
    }
}
