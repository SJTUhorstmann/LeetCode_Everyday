/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
import java.util.ArrayList;
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ArrayList<ListNode> list=new ArrayList<>();
        while(pHead!=null){
            if(list.contains(pHead))    return pHead;
            list.add(pHead);
            pHead=pHead.next;
        }
        return null;
    }
}