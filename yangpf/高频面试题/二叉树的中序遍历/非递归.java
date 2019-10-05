class Solution {
    List<Integer> res=new ArrayList<>();
    Stack<TreeNode> stack=new Stack<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)  return res;
        help(root);
        return res;
    }
    public void help(TreeNode node){
        if(node!=null){
            stack.push(node);
            help(node.left);
            TreeNode cur=stack.pop();
            res.add(cur.val);
            if(cur.right!=null){
                help(cur.right);
            }
        }
    }
}