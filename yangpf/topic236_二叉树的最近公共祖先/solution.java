ִ����ʱ :1208 ms, ������ Java �ύ�л�����5.01%���û�
�ڴ����� :38.9 MB, ������ Java �ύ�л�����8.06%���û�

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(isChildren(root.left,p)&&isChildren(root.left,q)){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(isChildren(root.right,p)&&isChildren(root.right,q)){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    //�ж�һ���ڵ��Ƿ�������һ�����ӽڵ�
    public boolean isChildren(TreeNode father,TreeNode children){
        if(father==children)    return true;
        if(father==null)    return false;
        return isChildren(father.left,children) || isChildren(father.right,children);
    }
}