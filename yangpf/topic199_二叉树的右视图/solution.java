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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)  return res;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                TreeNode tmp=q.poll();
                if(tmp.left!=null)  q.offer(tmp.left);
                if(tmp.right!=null)  q.offer(tmp.right);
                if(size==0) res.add(tmp.val);
            }
        }
        return res;
    }
}