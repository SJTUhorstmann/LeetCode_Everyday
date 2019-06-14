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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preOrder(root,list);
        return list;
    }
    public void preOrder(TreeNode root,List<Integer> list){
        if(root==null)  return;
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}