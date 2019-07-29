class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal=root.val;
        if(p.val>parentVal && q.val>parentVal){
            return lowestCommonAncestor(root.right,p,q);
        }else if(p.val<parentVal && q.val<parentVal){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
}