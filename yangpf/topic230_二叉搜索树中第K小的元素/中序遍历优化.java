/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// 优化主要在两点：1.之前是用ArrayList存，消耗时间   2.找到第K小的直接结束，不需遍历所有
// 执行用时 :1 ms, 在所有Java提交中击败了98.23%的用户
class Solution {
    int k;
    int number;
    public int kthSmallest(TreeNode root, int k) {
        //BST中序遍历即可是升序哎。
        this.k=k;
        inorder(root);
        return number;
    }
    public void inorder(TreeNode root)
    {
        //找到了就不找了哦
        if(root==null||k==0)
            return;
        inorder(root.left);  
        if(k==1)
        {
            number=root.val;
        }
        k--;
        inorder(root.right);
    }
}