/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        int step=0;
        while(step!=n){
            if(fast.next==null && step!=n){
                return head.next;
            }
            fast=fast.next;
            step++;
        }
        ListNode slow=head;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode node=slow.next;
        slow.next=node.next;
        node.next=null;
        return head;
    }
}
