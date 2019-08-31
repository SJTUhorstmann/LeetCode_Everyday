/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(listNode==null){
            return list;
        }
        ListNode next=listNode.next;
        ArrayList<Integer> list1=printListFromTailToHead(next);
        list.addAll(list1);
        list.add(listNode.val);
        return list;
            
    }
}