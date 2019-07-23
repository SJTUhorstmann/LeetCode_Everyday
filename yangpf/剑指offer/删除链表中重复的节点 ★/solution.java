public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode dummyHead=new ListNode(-1);
        ListNode pre=dummyHead;
        ListNode cur=pHead;
        while(cur!=null && cur.next!=null){
            if(cur.val==cur.next.val){
                int value=cur.val;
                while(cur!=null && cur.val==value)    cur=cur.next;
            }else{
                pre.next=cur;
                pre=cur;
                cur=cur.next;
            }
        }
        pre.next=cur;
        pre=cur;
        return dummyHead.next;
    }
}