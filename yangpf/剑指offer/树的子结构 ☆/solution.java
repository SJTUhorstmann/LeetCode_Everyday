import java.util.Stack;
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)    return false;
        if(root1.val==root2.val && containsNode(root1,root2))    return true;
        boolean flag1=HasSubtree(root1.left,root2);
        boolean flag2=HasSubtree(root1.right,root2);
        if(flag1 || flag2)    return true;
        return false;
    }
    public boolean containsNode(TreeNode node1,TreeNode node2){
        if(node2==null)    return true;
        if(node1==null)    return false;
        if(node1.val!=node2.val)    return false;
        return containsNode(node1.left,node2.left) && containsNode(node1.right,node2.right);
    }
}