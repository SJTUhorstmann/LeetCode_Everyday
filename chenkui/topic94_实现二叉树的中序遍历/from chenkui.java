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
    List<Integer> list=new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root==null){
            return list;
        }
        
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
       
        return list;
        
    }
}
*/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();  
        if(root==null){
            return list;
        }
        
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            
            TreeNode node = stack.pop();
            list.add(node.val);
            cur = node.right;
    
        }
        
    return list;
    
}
}