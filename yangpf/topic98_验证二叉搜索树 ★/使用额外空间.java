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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)  return true;
        inOrder(root,list);
        if(list.size()==1)  return true;
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1))  return false;
        }
        return true;
    }
    public void inOrder(TreeNode root,ArrayList<Integer> list){
        if(root==null)  return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}