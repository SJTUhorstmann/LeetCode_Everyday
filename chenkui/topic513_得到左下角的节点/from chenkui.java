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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> list=new LinkedList<TreeNode>();
        list.add(root);
        
        TreeNode tem=null;
        while(!list.isEmpty()){
            tem=list.poll();
            if(tem.right!=null){
                list.add(tem.right);
            }
            if(tem.left!=null){
                list.add(tem.left);
            }
        }
        return tem.val;
    }
}