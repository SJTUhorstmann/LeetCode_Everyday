class Solution {
     public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
         
        while(fastPointer != null) {
            if (n != 0) { 
                n--;
            } else {
                prev = slowPointer;
                slowPointer = slowPointer.next;                
            }
            fastPointer = fastPointer.next;
        }
        
        if (prev == null) return slowPointer.next;
        prev.next = slowPointer.next;
        return head;
    }
}