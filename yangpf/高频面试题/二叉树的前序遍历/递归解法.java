class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        help(root);
        return res;
    }
    public void help(TreeNode node){
        if(node!=null){
            res.add(node.val);
            if(node.left!=null) help(node.left);
            if(node.right!=null) help(node.right);
        }
    }
}