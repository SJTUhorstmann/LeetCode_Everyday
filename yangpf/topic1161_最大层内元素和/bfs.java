class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int max=Integer.MIN_VALUE;
        int level=1;
        int res=1;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            while(size-->0){
                TreeNode cur=q.poll();
                sum+=cur.val;
                if(cur.left!=null)  q.offer(cur.left);
                if(cur.right!=null)  q.offer(cur.right);
            }
            if(sum>max){
                max=sum;
                res=level;
            }
            level++;
        }
        return res;
    }
}