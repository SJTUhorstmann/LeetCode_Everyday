//目前写的不是最优解法，可优化
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(pRoot==null)    return res;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.add(pRoot);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<Integer>();
            while(size-->0){
                TreeNode node=q.poll();
                list.add(node.val);
                if(node.left!=null)    q.add(node.left);
                if(node.right!=null)    q.add(node.right);
            }
            if(level%2==0)    Collections.reverse(list);
            res.add(list);
            level++;
        }
        return res;
    }
}