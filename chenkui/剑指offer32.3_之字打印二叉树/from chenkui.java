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
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(pRoot);
    boolean reverse = false;
    while (!queue.isEmpty()) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = queue.size();
        while (cnt-- > 0) {
            TreeNode node = queue.poll();
            if (node == null){
                 continue;
            }
            list.add(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }
        if (reverse){
            Collections.reverse(list);
            Collections.sort(list,new Comparator<Integer>(){
                @Override
                public int compare(Integer a,Integer b){
                    return 0;
                }
            });
        }
        reverse = !reverse;
        if (list.size() != 0)
            ret.add(list);
    }
    return ret;
}

}