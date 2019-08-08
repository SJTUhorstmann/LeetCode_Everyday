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
/*
class Solution {
    private int count = 0;
    private int result;
    
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return result;
        
    }
    
    private void inOrder(TreeNode node, int k) {
        if (node == null){
            return;
        }

        inOrder(node.left, k);
        
        count++;
        if (count == k) {
            result= node.val;
            return;
        }
        
        inOrder(node.right, k);
   }
}

*/

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int leftCnt = count(root.left);
        if (leftCnt == k - 1){
            return root.val;
        } 
        else if (leftCnt > k - 1){
            return kthSmallest(root.left, k);
        }
        else{
            return kthSmallest(root.right, k - leftCnt - 1);
        }
        
    }

    private int count(TreeNode node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }
}