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
        if(root==null)  return true;
        return traverse(root.left,root.right);
    }
    public boolean traverse(TreeNode left,TreeNode right){
        if(left==null && right==null)   return true;
        if(left!=null && right!=null && left.val==right.val){
            return traverse(left.right,right.left) && traverse(left.left,right.right);
        }
        return false;
    }
}