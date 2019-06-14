/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyOdd=new ListNode(0);
        ListNode dummyEven=new ListNode(0);
        ListNode curOdd=dummyOdd;
        ListNode curEven=dummyEven;
        int count=1;
        ListNode cur=head;
        while(cur!=null){
            if(count%2==1){
                curOdd.next=new ListNode(cur.val);
                curOdd=curOdd.next;
            }
            else{
                curEven.next=new ListNode(cur.val);
                curEven=curEven.next;
            }    
            cur=cur.next;
            count++;
        }
        curOdd.next=dummyEven.next;
        return dummyOdd.next;
    }
}