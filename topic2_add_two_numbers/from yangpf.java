/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        ListNode dummyHead=new ListNode(0);
        ListNode cur=dummyHead;
        while(l1!=null || l2!=null){
            //sum=sum/10;
            //sum+=l1.val;
            int x=l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            sum+=x+y;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            sum=sum/10;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(sum==1)  cur.next=new ListNode(1);
        return dummyHead.next;
    }
}
