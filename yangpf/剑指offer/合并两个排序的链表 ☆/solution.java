public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode dummyHead=new ListNode(-1);
        ListNode cur=dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        if(list1!=null){
            cur.next=list1;
        }
        if(list2!=null){
            cur.next=list2;
        }
        return dummyHead.next;
    }
}