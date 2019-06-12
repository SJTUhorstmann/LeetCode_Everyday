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
        if(head==null || head.next==null)  return true;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //如果链表个数为奇数，此时fast应该为null，slow需要向后移动一位
        if(fast!=null)  slow=slow.next;        
        ListNode prev=null;
        ListNode cur=slow;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        while(prev!=null && head!=null){
            if(prev.val!=head.val)  return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
    }
}