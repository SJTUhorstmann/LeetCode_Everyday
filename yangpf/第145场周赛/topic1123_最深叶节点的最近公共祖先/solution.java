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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int left=findDepth(root.left);
        int right=findDepth(root.right);
        if(left>right){
            return lcaDeepestLeaves(root.left);
        }else if(left<right){
            return lcaDeepestLeaves(root.right);
        }else{
            return root;
        }
    }
    public int findDepth(TreeNode root){
        if(root==null)  return 0;
        return Math.max(findDepth(root.left),findDepth(root.right))+1;
    }
}