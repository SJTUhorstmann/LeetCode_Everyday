/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        if(l1==null)    return l2;
        if(l2==null)    return l1;
        if(l1.val<=l2.val){
            head=new ListNode(l1.val);
            l1=l1.next;
        }else{
            head=new ListNode(l2.val);
            l2=l2.next;
        }
        ListNode cur=head;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                cur.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                cur.next=new ListNode(l2.val);
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1==null){
            cur.next=l2;
        }
        if(l2==null){
            cur.next=l1;
        }
        return head;
    }
}
