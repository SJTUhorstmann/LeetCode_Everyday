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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        return isSubtreeWithRoot(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public boolean isSubtreeWithRoot(TreeNode s, TreeNode t){
        if(s==null && t==null){
            return true;
        }
        if(s==null || t==null){
            return false;
        }
        if(s.val != t.val){
            return false;
        }
        return isSubtreeWithRoot(s.left,t.left)&& isSubtreeWithRoot(s.right, t.right);
    }
}