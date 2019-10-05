class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        help(root);
        return res;
    }
    public void help(TreeNode node){
        if(node!=null){
            if(node.left!=null) help(node.left);
            res.add(node.val);
            if(node.right!=null) help(node.right);
        }
    }
}