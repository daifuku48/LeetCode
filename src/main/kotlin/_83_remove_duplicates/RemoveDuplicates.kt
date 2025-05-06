package _83_remove_duplicates

import listnode.ListNode

class RemoveDuplicates {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current: ListNode? = head ?: return head
        while (current?.next != null) {
            if (current.`val` == current.next!!.`val`) {
                current.next = current.next!!.next
            } else {
                current = current.next
            }
        }
        return head
    }
}