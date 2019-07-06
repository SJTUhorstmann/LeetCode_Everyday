/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   
    //方法1
    
    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        
        ListNode list1=headA;
        ListNode list2=headB;
        while(list1!=list2){
            list1=(list1==null)? headB:list1.next;
            list2=(list2==null)? headA:list2.next;
        }
        return list1;
        
     }*/
    
    //方法2
    
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA==null || headB==null){
            return null;
         }
        
         HashMap<ListNode,Integer> map=new HashMap();
         
         while(headA!=null){
             map.put(headA,1);
             headA=headA.next;
         }
         
         while(headB!=null){
            if(map.containsKey(headB)){
                return headB;
            }
            else{
                headB=headB.next;
            }
         }

        return null;
        
     }
}