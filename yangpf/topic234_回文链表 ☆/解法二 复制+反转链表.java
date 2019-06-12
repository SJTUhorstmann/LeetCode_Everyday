/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)  return true;
        ListNode head1=new ListNode(head.val);
        ListNode cur=head;
        ListNode cur1=head1;
        while(cur.next!=null){
            cur1.next=new ListNode(cur.next.val);
            cur=cur.next;
            cur1=cur1.next;
        }
        //·´×ªÁ´±í head
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        while(prev!=null && head1!=null){
            if(prev.val!=head1.val) return false;
            prev=prev.next;
            head1=head1.next;
        }
        return true;
    }
}