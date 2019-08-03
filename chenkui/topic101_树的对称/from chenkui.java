/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        else{
           return symmetric(root.left,root.right);
        }
        
    }
    
    private boolean symmetric(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        else if(left==null || right==null){
            return false;
        }
        else if(left.val != right.val){
            return false;
        }
        else{
            return symmetric(left.left,right.right) && symmetric(left.right,right.left);
        }
    }
}