class Solution {
    public int maxLevelSum(TreeNode root) {
        LinkedList<TreeNode> q=new LinkedList<>();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        q.offer(root);
        TreeNode nextNode=root;
        int level=1;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            sum+=node.val;
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
            if(node==nextNode){
                nextNode=q.peekLast();
                max=Math.max(max,sum);
                map.put(level,sum);
                sum=0;
                level++;
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==max)   return entry.getKey();
        }
        return -1;
    }
}