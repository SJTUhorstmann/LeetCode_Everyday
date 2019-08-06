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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        
        if(root==null){
            return list;
        }
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode tree=stack.pop();
            list.add(tree.val);
            TreeNode left=tree.left;
            TreeNode right=tree.right;
            
            if(right!=null){
                stack.push(right);
            }
            
            if(left!=null){
                stack.push(left);
            }
            
        }
        return list;
        
    }
}
*/

//方法2

class Solution {

    List<Integer> list=new ArrayList<Integer>();  
    
    public List<Integer> preorderTraversal(TreeNode root) {  
        if(root==null){
            return list;
        }
        
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
       
        return list;
        
    }
}