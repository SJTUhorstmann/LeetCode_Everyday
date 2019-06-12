/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map=new HashMap<>();
        int count=0;
        while(head!=null){
            if(map.containsKey(head))   return true;
            map.put(head,count++);
            head=head.next;
        }
        return false;
    }
}