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
     //Ë«Ö¸Õë
    /* if(head==null || head.next==null) return false;
      ListNode fast=head.next.next;
      ListNode slow=head.next;
      while(slow!=null){
        if(fast==slow) return true;
        else if(fast==null || fast.next==null) return false;
        else{
          fast=fast.next.next;
          slow=slow.next;
        }
      }
     return false;  
    } 

    */
     // ÓÃHashMap
      HashMap<ListNode,Integer> map=new HashMap<>();
      while(head!=null){
        if(map.containsKey(head)){
          return true;
        }
        else{
          map.put(head,1);
          head=head.next;
        }
      }
      return false;
    }     
}