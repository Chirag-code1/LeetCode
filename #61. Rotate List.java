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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0){
            return head;
        }
        ListNode temp = head;
        int count = 1;
        while (head.next != null){
            head = head.next;
            count++;
        }
        
        head.next = temp;
        
        int headi = k % (count);
        int tail = count - headi;
        
        while (tail > 1) {
            temp = temp.next;
            tail--;
        }
               
        ListNode  result = temp.next;
        temp.next = null;
         return result;               
    }
}
