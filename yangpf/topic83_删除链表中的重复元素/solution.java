class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre=head;
        ListNode cur=head;
        while(cur!=null){
            int value=cur.val;
            while(cur!=null && cur.val==value)   cur=cur.next;
            pre.next=cur;
            pre=cur;
        }
        return head;
    }
}