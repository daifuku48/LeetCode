package sort_list_148

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

interface SortList{
    fun sortList(head: ListNode?): ListNode?
}

class Solution : SortList{
    override fun sortList(head: ListNode?): ListNode? {
// no elem or only 1 elem
        if (head?.next == null) return head

        // find middle
        var slow = head; var fast = head
        while (fast?.next != null && fast.next?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        // break the chain
        val temp = slow?.next
        slow?.next = null

        // divide
        var l = sortList(head)
        var r = sortList(temp)

        // conquer
        val dummy = ListNode(-1)
        var d = dummy

        while (l != null && r != null) {
            if (l.`val` < r.`val`) {
                d.next = l
                l = l.next
            } else {
                d.next = r
                r = r.next
            }
            d = d.next!!
        }

        if (l != null) d.next = l
        if (r != null) d.next = r

        return dummy.next
    }
}

fun main()
{
    val li = ListNode(4)
    val solution = Solution()
    print(solution.sortList(li))
}
