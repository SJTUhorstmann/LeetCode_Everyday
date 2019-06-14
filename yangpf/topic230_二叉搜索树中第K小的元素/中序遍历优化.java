/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// �Ż���Ҫ�����㣺1.֮ǰ����ArrayList�棬����ʱ��   2.�ҵ���KС��ֱ�ӽ����������������
// ִ����ʱ :1 ms, ������Java�ύ�л�����98.23%���û�
class Solution {
    int k;
    int number;
    public int kthSmallest(TreeNode root, int k) {
        //BST����������������򰥡�
        this.k=k;
        inorder(root);
        return number;
    }
    public void inorder(TreeNode root)
    {
        //�ҵ��˾Ͳ�����Ŷ
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