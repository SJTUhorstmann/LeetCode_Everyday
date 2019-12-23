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
        return toBST(nums,0,nums.length-1);
    }
    public TreeNode toBST(int[] nums,int sIdx, int eIdx){
        if(sIdx>eIdx) return null;
        int mIdx = sIdx+(eIdx-sIdx)/2;
        TreeNode root = new TreeNode(nums[mIdx]);
        root.left = toBST(nums,sIdx,mIdx-1);
        root.right = toBST(nums,mIdx+1,eIdx);
        return root;
    }
}