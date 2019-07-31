/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            length(root);
            return max;
        }
        
    }
    
    private int length(TreeNode root){
        if(root==null){
            return 0;
        }
    
        int left=length(root.left);
        int right=length(root.right);
        int tem=left+right;
        max=Math.max(max,tem);
        return Math.max(left,right)+1;
        
    }
}
*/

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            int left=length(root.left);
            int right=length(root.right);
            int max=left+right;
            int max1=diameterOfBinaryTree(root.left);
            int max2=diameterOfBinaryTree(root.right);
            
            return Math.max(max,Math.max(max1,max2));
        }
        
    }
    
    private int length(TreeNode root){
        if(root==null){
            return 0;
        }
    
        int left=length(root.left);
        int right=length(root.right);

        return Math.max(left,right)+1;
        
    }
}