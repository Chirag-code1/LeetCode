import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<Integer>();
        ListNode curr = head;
        boolean isPalin = true;
        
        while(curr!=null){
            st.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            int poppedData = st.pop();
            if(curr.val == poppedData){
                isPalin = true;
            } else {
                isPalin = false;
                break;
            }
            curr = curr.next;
        }
        return isPalin;
    }
}
// revised.
