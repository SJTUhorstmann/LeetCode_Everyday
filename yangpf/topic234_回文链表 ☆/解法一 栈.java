/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //用栈的方法
        if(head==null)  return true;
        Stack<ListNode> stack=new Stack<>();
        ListNode cur=head;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while(!stack.isEmpty()){
            if(head.val!=stack.pop().val)   return false;
            head=head.next;
        }
        return true;
    }
}