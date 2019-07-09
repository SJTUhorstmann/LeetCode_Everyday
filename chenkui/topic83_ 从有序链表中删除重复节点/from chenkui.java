/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode result=head;
        while(head!=null){
            
            int tem=head.val;
            ListNode head2=head.next;
            while (head2!=null && head2.val==tem){
                head2=head2.next;
            }
            
            head.next=head2;
            head=head.next;
            
        }

        return result;
            
    }
}