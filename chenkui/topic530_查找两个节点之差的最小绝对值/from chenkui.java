/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//方法1

class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        if (root == null){
           return min;
        } 
        
        getMinimumDifference(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);
        
        return min;
    }
}


//方法2
/*
class Solution {
    public int getMinimumDifference(TreeNode root) {
        int min=Integer.MAX_VALUE;
        if(root==null){
            return min;
        }
        
        if(root.left!=null){
            int tem=root.val-root.left.val;
            min=Math.min(min,tem);
            TreeNode left1=root.left;
            while(left1.right!=null){
                tem=root.val-left1.right.val;
                min=Math.min(min,tem);
                left1=left1.right;
            }
        }
        
        if(root.right!=null){
            int tem=root.right.val-root.val;
            min=Math.min(min,tem);
            TreeNode right1=root.right;
            while(right1.left!=null){
                tem=right1.left.val-root.val;
                min=Math.min(min,tem); 
                right1=right1.left;
            }
        }
        
        int left=getMinimumDifference(root.left);
        int right=getMinimumDifference(root.right);
        min=Math.min(min,left);
        min=Math.min(min,right);
        
        return min;
        
    }
}
*/