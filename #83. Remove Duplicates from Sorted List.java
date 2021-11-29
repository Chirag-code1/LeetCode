class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr =head;
        
        while(curr!=null){
            ListNode temp = curr;
            
            while(temp!=null && temp.val == curr.val)
                temp = temp.next;
            
            curr.next = temp;
            curr = curr.next;
        }
        
        return head;
    }
}
