/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
     public ListNode[] splitListToParts(ListNode root, int k) {
        int count=0;
        ListNode node=root;
        while(node!=null){
            count++;
            node=node.next;
        }
        int tem=count/k;
        int tem1=count%k;

        ListNode[] list=new ListNode[k];
        
        for (int i = 0; root != null && i < k; i++) {
           list[i] = root;
           int curSize = tem + (tem1-- > 0 ? 1 : 0);
           for (int j = 0; j < curSize - 1; j++) {
              root = root.next;
           }
           ListNode next = root.next;
           root.next = null;
           root = next;
        }
        
        return list;
    }
    
}