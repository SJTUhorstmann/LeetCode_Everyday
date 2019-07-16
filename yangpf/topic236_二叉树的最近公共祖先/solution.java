执行用时 :1208 ms, 在所有 Java 提交中击败了5.01%的用户
内存消耗 :38.9 MB, 在所有 Java 提交中击败了8.06%的用户

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
    //判断一个节点是否是另外一个的子节点
    public boolean isChildren(TreeNode father,TreeNode children){
        if(father==children)    return true;
        if(father==null)    return false;
        return isChildren(father.left,children) || isChildren(father.right,children);
    }
}