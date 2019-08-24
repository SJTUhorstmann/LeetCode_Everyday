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
        return sortedArrayToBST(nums,0,nums.length);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if (start == end) {
        return null;
     }
        int mid = (start+end-1)/2;
        TreeNode resNode = new TreeNode(nums[mid]);
        resNode.left = sortedArrayToBST(nums,start,mid);
        resNode.right = sortedArrayToBST(nums,mid+1,end);
        return resNode;
        
    }
}