public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next==null)    return head;
        ListNode pre=null;
        ListNode cur=head;
        ListNode next=head.next;
        while(next!=null){
            cur.next=pre;
            pre=cur;
            cur=next;
            next=cur.next;
            //cur.next=pre;
        }
        cur.next=pre;
        return cur;
    }
}