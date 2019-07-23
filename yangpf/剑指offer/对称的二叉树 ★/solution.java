public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)    return true;
        return symmetricalHelp(pRoot.left,pRoot.right);
    }
    boolean symmetricalHelp(TreeNode left,TreeNode right){
        if(left==null && right==null)    return true;
        if(left==null || right==null)    return false;
        if(left.val==right.val){
            return symmetricalHelp(left.left,right.right) && symmetricalHelp(left.right,right.left);
        }
        return false;
    }
}