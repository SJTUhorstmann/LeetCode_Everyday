public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)    return head;
        ListNode cur=head;
        while(k-->0){
            cur=cur.next;
            if(cur==null){
                if(k==0)    return head;
                else    return null;
            }
        }
        while(cur!=null){
            head=head.next;
            cur=cur.next;
        }
        return head;
    }
}