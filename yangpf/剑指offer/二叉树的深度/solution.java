public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)    return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}