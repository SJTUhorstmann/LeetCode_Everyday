/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA;
        ListNode cur2=headB;
        int len1=0;
        int len2=0;
        while(cur1!=null){
            len1++;
            cur1=cur1.next;
        }
        while(cur2!=null){
            len2++;
            cur2=cur2.next;
        }
        if(len1>len2){
            headA=forward(headA,len1-len2);
        }
        if(len1<len2){
            headB=forward(headB,len2-len1);
        }
        while(headA!=null){
            if(headA==headB)  return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public ListNode forward(ListNode head,int step){
        while(step>0){
            head=head.next;
            step--;
        }
        return head;
    }
}