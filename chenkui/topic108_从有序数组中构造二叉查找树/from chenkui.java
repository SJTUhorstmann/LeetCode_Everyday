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
    public TreeNode sortedArrayToBST(int[] nums) {
      int left=0;
      int right=nums.length-1;
        
      if(right-left==0){
         return new TreeNode(nums[0]); 
      }

      else{
         TreeNode root= ToBST(nums,left,right);
         return root;
      }    
    }
    
    private TreeNode ToBST(int[] nums,int low,int high){

      if(low>high) {
         return null;
      }
        
      int mid=low+(high-low)/2;
      TreeNode tree=new TreeNode(nums[mid]);
      if(low!=high){
        tree.left=ToBST(nums,low,mid-1);
        tree.right=ToBST(nums,mid+1,high);
      }
        
      return tree;
    }
    
}