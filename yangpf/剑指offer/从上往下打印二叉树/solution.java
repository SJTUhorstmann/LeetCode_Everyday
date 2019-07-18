import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(root==null)    return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            res.add(node.val);
            if(node.left!=null)    queue.add(node.left);
            if(node.right!=null)    queue.add(node.right);
        }
        return res;
    }
}
