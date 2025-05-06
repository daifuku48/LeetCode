package listnode

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun createLinkedList(values: IntArray): ListNode? {
    if (values.isEmpty()) return null

    val head = ListNode(values[0])
    var current = head
    for (i in 1 until values.size) {
        current.next = ListNode(values[i])
        current = current.next!!
    }
    return head
}

fun printLinkedList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
    println("null")
}

