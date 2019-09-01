/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null || (pRoot.left==null && pRoot.right==null)){
            return true;
        }
        return judge(pRoot.left,pRoot.right);
    }
    
    public boolean judge(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null) {
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return judge(left.left,right.right) && judge(left.right,right.left);
    }
}