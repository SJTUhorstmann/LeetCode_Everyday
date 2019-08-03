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
    int result=0;
    public int findTilt(TreeNode root) {
      if(root==null) {
          return 0;
      }
      Tilt(root);
      return result;
    }
    private int Tilt(TreeNode root){
      if(root==null) {
          return 0;
      }
      int left=Tilt(root.left);
      int right=Tilt(root.right);
      result=result+Math.abs(left-right);
      return left+right+root.val;
    }
}