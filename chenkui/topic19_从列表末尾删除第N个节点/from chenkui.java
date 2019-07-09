/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //方法1
     /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
         
        while(fastPointer != null) {
            if (n != 0) { 
                n--;
            } 
            else {
                prev = slowPointer;
                slowPointer = slowPointer.next;                
            }
            fastPointer = fastPointer.next;
        }
        
        if (prev == null)
            return slowPointer.next;
         
        prev.next = slowPointer.next;
        return head;
    }*/
    
    //方法2
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode fast = head;
        
    while (n-- > 0) {
        fast = fast.next;
    }
        
    if (fast == null) 
        return head.next;
        
    ListNode slow = head;
    while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return head;
}
}