import java.util.*;
/**
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue= new LinkedList<>();
        if(root == null){
            return list;
        }
        else{
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode tree = queue.poll();
                list.add(tree.val);
                if(tree.left != null){
                    queue.add(tree.left);
                }
                if(tree.right != null){
                    queue.add(tree.right);
                }
            }
        }
        return list;
    }
}