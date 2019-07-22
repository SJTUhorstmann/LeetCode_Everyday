//需要补充一下非递归中序遍历解法
import java.util.ArrayList;
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(k==0)    return null;
        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
        inOrder(pRoot,list);
        if(list.size()<k)    return null;
        return list.get(k-1);
    }
    void inOrder(TreeNode node,ArrayList<TreeNode> list){
        if(node==null)    return;
        inOrder(node.left,list);
        list.add(node);
        inOrder(node.right,list);
    }


}