//头插效率太低

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(listNode!=null){
            res.add(0,listNode.val);
            listNode=listNode.next;
        }
        return res;
    }
}