/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    //方法1
    /*public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode next1=head.next;
        ListNode rever=reverseList(next1);
        next1.next=head;
        head.next=null;
        return rever; 
    }*/
    
    //方法2
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode tem= new ListNode(0);
        while(head!=null){
            ListNode next=head.next;
            head.next=tem.next;
            tem.next=head;
            head=next;
        }

        return tem.next; 
    }
}