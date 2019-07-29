class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node=root;
        while(help(node.left,p)==true && help(node.left,q)==true || help(node.right,p)==true && help(node.right,q)==true){
            while(help(node.left,p)==true && help(node.left,q)==true){
                node=node.left;
            }
            while(help(node.right,p)==true && help(node.right,q)==true){
                node=node.right;
            }
        }
        return node;
    }
    public boolean help(TreeNode p,TreeNode q){
        if(q==null) return true;
        if(p==null) return false;
        if(p==q)    return true;
        return help(p.left,q) || help(p.right,q);
    }
}