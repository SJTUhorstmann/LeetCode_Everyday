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
    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        } 
        int ret = pathSumStartWithRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        return ret;
    }

    private int pathSumStartWithRoot(TreeNode root, int sum) {
        if (root == null){
            return 0;
        } 
        int ret = 0;
        if (root.val == sum){
            ret=1;
        } 
        ret = ret+ pathSumStartWithRoot(root.left, sum - root.val);
        ret = ret+ pathSumStartWithRoot(root.right, sum - root.val);
        return ret;
    }
}