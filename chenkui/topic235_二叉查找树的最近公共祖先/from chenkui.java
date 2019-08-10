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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode tem=p;
            p=q;
            q=tem;
        }
        
        if(p.val>root.val && root.right!=null){
            return lowestCommonAncestor(root.right, p, q);
        }
        else if(q.val<root.val && root.left!=null ){
            return lowestCommonAncestor(root.left, p, q);
        }
        
        return root;     
    }
}