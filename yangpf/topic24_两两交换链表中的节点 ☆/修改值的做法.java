class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            int temp=cur.next.val;
            cur.next.val=cur.val;
            cur.val=temp;
            cur=cur.next.next;
        }
        return head;
    }
}