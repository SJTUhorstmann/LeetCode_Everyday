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
    
    /*
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode work = dummy;
        
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                work.next = l1;
                work = work.next;
                l1 = l1.next;
            }
            
            else{
                work.next = l2;
                work = work.next;
                l2 = l2.next;
            }
        }
        
        while (l1 != null){
            work.next = l1;
            work = work.next;
            l1 = l1.next;
        }
        
        while (l2 != null){
            work.next = l2;
            work = work.next;
            l2 = l2.next;
        }
        
        return dummy.next;
    }*/
    
    //方法2
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        
        if (l2 == null){
            return l1;
        }
        
        if (l1.val < l2.val) {
           l1.next = mergeTwoLists(l1.next, l2);
           return l1;
        } 
        else {
           l2.next = mergeTwoLists(l1, l2.next);
           return l2;
    }
}
}