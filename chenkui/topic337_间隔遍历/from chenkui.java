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
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        int max1=root.val;
        if(root.left!=null){
            max1=max1+rob(root.left.left)+rob(root.left.right);
        }
        if(root.right!=null){
            max1=max1+rob(root.right.left)+rob(root.right.right);
        }
        int max2=rob(root.left)+rob(root.right);
        
        int max=Math.max(max1,max2);
        return max;
        
    }
}