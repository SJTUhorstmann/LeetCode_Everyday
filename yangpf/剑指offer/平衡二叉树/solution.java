public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)    return true;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)
            && Math.abs(getDepth(root.left)-getDepth(root.right))<=1;
    }
    public int getDepth(TreeNode node){
        if(node==null)    return 0;
        return Math.max(getDepth(node.left),getDepth(node.right))+1;
    }
}