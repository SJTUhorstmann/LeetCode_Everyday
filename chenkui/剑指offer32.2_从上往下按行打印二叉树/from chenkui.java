import java.util.*;


/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(size-->0){
                TreeNode node=queue.poll();
                if(node==null) continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if(list.size()!=0) list1.add(list);
        }
     return list1;
    }
    
}