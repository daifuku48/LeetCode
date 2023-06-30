package _206_reverse_linked_list
class ListNode(var `val`: Int) {
         var next: ListNode? = null
    }

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var curr = head
        var prev : ListNode? = null
        while (curr != null)
        {
            var next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}