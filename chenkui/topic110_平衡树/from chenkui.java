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
    boolean judge=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int len1=length(root.left);
        int len2=length(root.right);
        int tem=Math.abs(len1-len2);
        if(tem>1){
            return false;
        }
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
        
    }
    
    private int length(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            int left=length(root.left);
            int right=length(root.right);
            return Math.max(left,right)+1;
        }
    }
}
*/

//方法2

class Solution {
    boolean result=true;
    public boolean isBalanced(TreeNode root) {
      deep(root);
      return result;
    }
    
    private int deep(TreeNode tree){
        
      if(tree==null){
          return 0;
      }
      int left=deep(tree.left);
      int right=deep(tree.right);
        
      if(Math.abs(left-right)>1){
          result=false;
      } 
        
      return 1+Math.max(left,right);
    }
}