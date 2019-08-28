/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || pre.length==0){
            return null;
        }
        TreeNode tree=BinaryTree(pre,in,0,0,pre.length-1,in.length-1);
        return tree;
    }
    
    private TreeNode BinaryTree(int[] pre, int[] in,int l1,int l2,int r1,int r2){
        if(l1>r1 || l2>r2){
            return null;
        }
        int tem=pre[l1];
        int index=l2;
        for(int i=l2;i<=r2;i++){
            if(in[i]==tem){
                index=i;
            }
        }
        TreeNode node=new TreeNode(tem);
        node.left=BinaryTree(pre,in,l1+1,l2,l1+index-l2,index-1);
        node.right=BinaryTree(pre,in,l1+index-l2+1,index+1,r1,r2);
        
        return node;
    }
}