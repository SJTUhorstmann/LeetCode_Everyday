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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root==null)  return res;
        String str="";
        help(root,str,res);
        return res;
    }
    public void help(TreeNode root,String str,List<String> res){
        if(root==null)  return;
        str+=root.val;
        if(root.left==null && root.right==null){
            res.add(str);
        }else{
            help(root.left,str+"->",res);
            help(root.right,str+"->",res);
        }
    }
}