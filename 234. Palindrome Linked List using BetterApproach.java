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
import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        
        ListNode slow = head, fast = head, midNode = null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast!=null){
            midNode = slow.next;
        } else {
            midNode = slow;
        }
        
        ListNode prev = null, next = null;
        while(midNode!=null){
            next = midNode.next;
            midNode.next = prev; prev = midNode; midNode = next;
        }
        
        while(prev!=null){
            if(prev.val != head.val){
                return false;
            }
            prev = prev.next; head = head.next;
        }
        
        return true;
    }
}
