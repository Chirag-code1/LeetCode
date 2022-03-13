/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(n-- > 0)
            fast = fast.next;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        if(fast == null && slow == head)
        {
            head = head.next;
        } else {
            slow.next = slow.next.next;
        }
        
        return head;
    }
} //revised.
