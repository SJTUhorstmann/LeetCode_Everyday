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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        return list.get(k-1);
    }
    public void inOrder(TreeNode root,List<Integer> list){
        if(root==null)  return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}