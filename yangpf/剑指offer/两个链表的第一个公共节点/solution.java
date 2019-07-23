/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1=getLen(pHead1);
        int len2=getLen(pHead2);
        if(len1>len2){
            pHead1=move(pHead1,len1-len2);
        }else{
            pHead2=move(pHead2,len2-len1);
        }
        while(pHead1!=null){
            if(pHead1==pHead2)    return pHead1;
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return null;
    }
    public int getLen(ListNode node){
        int len=0;
        while(node!=null){
            len++;
            node=node.next;
        }
        return len;
    }
    public ListNode move(ListNode node,int step){
        while(step-->0){
            node=node.next;
        }
        return node;
    }
}