/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 方法1
/*class Solution {
   public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    if (fast != null) { // odd nodes: let right half smaller
        slow = slow.next;
    }
    slow = reverse(slow);
    fast = head;
    
    while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
  }

  public ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}
} */
    
//方法2
/*
class Solution {
    public boolean isPalindrome(ListNode head) {
      if(head==null) return true;
        //复制链表的头节点
        ListNode head1=new ListNode(head.val);
        ListNode cur=head;
        ListNode cur1=head1;
        //复制链表
        while(cur.next!=null){
            cur1.next=new ListNode(cur.next.val);
            cur=cur.next;
            cur1=cur1.next;
        }
        //反转链表 head
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
      
        //比较复制的链表和反转的链表
        while(prev!=null && head1!=null){
            if(prev.val!=head1.val) return false;
            prev=prev.next;
            head1=head1.next;
        }
        return true;
    }
}
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        Stack<Integer> stack=new Stack<Integer>();
        ListNode list=head;
        int count=0;
        while(list!=null){
            stack.push(list.val);
            list=list.next;
            count++;
        }
        int count1=(count+1)/2;
        while(head!=null){
            int tem=stack.pop();
            if(head.val!=tem){
                return false;
            }
            head=head.next;
            count1--;
            if(count1<=0){
                break;
            }
        }
        return true;
    }
}