/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

/**
public class Solution {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        Mirror(root.left);
        Mirror(root.right);
        mirror(root);
    }
    
    private void mirror(TreeNode root){
        if(root==null){
            return ;
        }
        TreeNode tem=root.left;
        root.left=root.right;
        root.right=tem;
    }
}
*/

public class Solution {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        root=mirror(root);
    }
    
    private TreeNode mirror(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode left1=root.left;
        TreeNode right1=root.right;
        TreeNode tem=mirror(left1);
        root.left=mirror(right1);
        root.right=tem;
        return root;
    }
}