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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        inOrder(root,list);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            min=Math.min(min,Math.abs(list.get(i)-list.get(i+1)));
        }
        return min;
    }
    public void inOrder(TreeNode root,ArrayList<Integer> list){
        if(root==null)  return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}