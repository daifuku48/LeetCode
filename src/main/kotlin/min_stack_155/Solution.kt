package min_stack_155

import java.lang.Integer.min

class MinStack() {

    data class Node(
        val value: Int,
        var min: Int
    )

    private val stack = mutableListOf<Node>()

    fun push(`val`: Int) {
        if (stack.isEmpty()) {
            stack.add(Node(`val`, `val`))
        } else {
            stack.add(Node(`val`, min(stack[stack.size - 1].min, `val`)))
        }
    }

    fun pop() {
        stack.removeAt(stack.size - 1)
    }

    fun top() = stack.last().value

    fun getMin() = stack.last().min

}