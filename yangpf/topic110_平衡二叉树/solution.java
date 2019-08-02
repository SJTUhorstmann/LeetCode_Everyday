class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)  return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(getDepth(root.left)-getDepth(root.right))<=1;
    }
    public int getDepth(TreeNode root){
        if(root==null)  return 0;
        return Math.max(getDepth(root.left),getDepth(root.right))+1;
    }
}