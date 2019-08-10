/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//方法1
/*
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null){
            return null;
        } 
        if (head.next == null){
            return new TreeNode(head.val);
        } 
        
        ListNode ListToBST = ListToBST(head);
        ListNode mid = ListToBST.next;
        ListToBST.next = null; 
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        
        return root;
    }

    private ListNode ListToBST(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode pre = head;
        
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return pre;
    }
}
*/

//方法2
class Solution {
    private List<Integer> list;
    public TreeNode sortedListToBST(ListNode head) {
        list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        
        return ToBST(0,list.size());
    }
    
    public TreeNode ToBST(int l,int r){
        
        if(l<r){
            int middle = (l+r)/2;
            int val = list.get(middle);
            TreeNode root = new TreeNode(val);
            root.left = ToBST(l,middle);
            root.right = ToBST(middle+1,r);
            return root;
        }
        
        return null;
    }
}