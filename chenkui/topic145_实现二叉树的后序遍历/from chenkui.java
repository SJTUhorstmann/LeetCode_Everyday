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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
       
        return list;
    }
}

*/

//方法2

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        Stack<TreeNode> stack1=new Stack<TreeNode>();
        
        if(root==null){
            return list;
        }
        
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode tree=stack.pop();
            TreeNode left=tree.left;
            TreeNode right=tree.right;
            
            if(left!=null){
                stack.push(left);
            }
            
            if(right!=null){
                stack.push(right);
            }
            stack1.push(tree);
        }
        
        while(!stack1.isEmpty()){
            TreeNode tree1=stack1.pop();
            list.add(tree1.val);
        }
        
        return list;
        
    }
}
