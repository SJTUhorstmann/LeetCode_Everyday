class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        help(root);
        return res;
    }
    public void help(TreeNode node){
        if(node!=null){
            if(node.left!=null) help(node.left);
            if(node.right!=null) help(node.right);
            res.add(node.val);
        }
    }
}