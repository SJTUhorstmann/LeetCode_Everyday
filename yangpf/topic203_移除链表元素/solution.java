class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur=head;
        ListNode dummyHead=new ListNode(-1);
        ListNode pre=dummyHead;
        while(cur!=null){
            if(cur.val!=val){
                pre.next=cur;
                pre=cur;
                cur=cur.next;
            }else{
                cur=cur.next;
            }
        }
        pre.next=cur;
        return dummyHead.next;
    }
}