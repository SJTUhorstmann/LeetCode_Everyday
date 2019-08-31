/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast=pHead;
        ListNode slow=pHead;
        if(pHead==null || pHead.next==null || pHead.next.next==null) {
            return null;
        }
        while(fast.next!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==null) return null;
            if(slow==fast) break;
        }
        slow=pHead;
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}