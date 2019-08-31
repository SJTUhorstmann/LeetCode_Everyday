/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/*
//递归
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode next=head.next;
        ListNode reverse=ReverseList(next);
        head.next=null;
        next.next=head;
        return reverse;
    }
}*/

//迭代
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode result=new ListNode(0);
        while(head!=null){
            ListNode next=head.next;
            head.next=result.next;
            result.next=head;
            head=next;
        }
        return result.next;
    }
}