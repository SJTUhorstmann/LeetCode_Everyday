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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)  return 0;
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                TreeNode cur=q.poll();
                if(cur.left!=null)
                    q.offer(cur.left);
                if(cur.right!=null)
                    q.offer(cur.right);
            }
            level++;
        }
        return level;
    }
}