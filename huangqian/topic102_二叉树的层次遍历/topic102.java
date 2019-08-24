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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root==null) return res;
        
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty())
        {
            List<Integer> lev = new LinkedList<Integer>();
            int levnum = que.size();
            for(int i=0;i<levnum;i++)
            {
                TreeNode head = que.poll();
                if(head.left!=null) que.offer(head.left);
                if(head.right!=null) que.offer(head.right);
                lev.add(head.val);
            }
            res.add(lev);
        }
        return res;
        
    }
}