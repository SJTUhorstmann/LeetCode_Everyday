import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        ListNode head=reverse(listNode);
        while(head!=null){
            res.add(head.val);
            head=head.next;
        }
        return res;
    }
    public ListNode reverse(ListNode listNode){
        ListNode prev=null;
        ListNode head=listNode;
        if(listNode==null)    return listNode;
        while(head.next!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        head.next=prev;
        return head;
    }
}