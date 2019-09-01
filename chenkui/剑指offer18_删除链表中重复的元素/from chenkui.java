/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/


public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null || pHead.next==null){
            return pHead;
        }
        if(pHead.val==pHead.next.val){
            pHead=pHead.next;
            while(pHead.next!=null && pHead.val==pHead.next.val){
                  pHead=pHead.next;
            }
            return deleteDuplication(pHead.next);
        }
        else{
            pHead.next=deleteDuplication(pHead.next);
        }
        return pHead;
     }
  }
