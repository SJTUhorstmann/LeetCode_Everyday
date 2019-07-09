/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // 方法1
    /*public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode result=head;
        while(head!=null){
            
            int tem=head.val;
            ListNode head1=head.next;
            while (head1!=null && head1.val==tem){
                head1=head1.next;
            }
            
            head.next=head1;
            head=head.next;
            
        }
        return result;
            
    }*/
    
    // 方法2
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        if(head.val==head.next.val){
            return deleteDuplicates(head.next);
        }
        else{
            head.next=deleteDuplicates(head.next);
        }
        
        return head;
            
    }
}