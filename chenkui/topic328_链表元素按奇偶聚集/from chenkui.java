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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode list=head;
        ListNode list1=new ListNode(-1);
        ListNode list3=list1;
        
        while(list!=null){
            int tem=list.val;
            list1.next=new ListNode(tem);
            list1=list1.next;
            list=list.next;
            if(list!=null){
                list=list.next;
            }
        }
        
         ListNode list2=head.next;
         while(list2!=null){
            int tem1=list2.val;
            list1.next=new ListNode(tem1);
            list2=list2.next;
            list1=list1.next;
            if(list2!=null){
                list2=list2.next;
            }
        }
        list1.next=null;
        return list3.next;
        
    }

   // 方法2
  public ListNode oddEvenList(ListNode head) {
    if (head == null) {
        return head;
    }
    ListNode odd = head；
    ListNode even = head.next;
    ListNode evenHead = even;
    while (even != null && even.next != null) {
        odd.next = odd.next.next;
        odd = odd.next;
        even.next = even.next.next;
        even = even.next;
    }
    odd.next = evenHead;
    return head;
}
}