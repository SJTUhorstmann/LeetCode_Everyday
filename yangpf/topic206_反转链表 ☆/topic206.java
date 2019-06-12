/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// 使用额外的存储空间，时间效率也低
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        if(head==null)  return null;
        while(head!=null){
            ListNode cur=head;
            head=head.next;
            cur.next=null;
            stack.push(cur);
        }
        ListNode newHead=stack.pop();
        ListNode current=newHead;
        while(!stack.isEmpty()){
            current.next=stack.pop();
            current=current.next;
        }
        return newHead;
    }
}

// 迭代
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        //pre.next=head;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            //ListNode cur=head;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}