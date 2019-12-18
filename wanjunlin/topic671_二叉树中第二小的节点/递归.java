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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        if(root.left==null && root.right == null){
            return -1;
        }
        int leftval = root.left.val;
        int rightval = root.right.val;
        leftval = leftval==root.val? findSecondMinimumValue(root.left):leftval;
        rightval = rightval==root.val? findSecondMinimumValue(root.right):rightval;
        if(leftval!=-1&& rightval!=-1){
            return Math.min(leftval,rightval);
        }
        if(leftval!=-1){
            return leftval;
        }
        return rightval;
    }
}