public class Solution {
    int index=-1;
    String Serialize(TreeNode root) {
        if(root==null)    return ".#";
        StringBuilder sb=new StringBuilder();
        return sb.append(root.val+"#").append(Serialize(root.left))
            .append(Serialize(root.right)).toString();
    }
    TreeNode Deserialize(String str) {
        String[] strs=str.split("#");
        return Deserialize(strs);
    }
    TreeNode Deserialize(String[] strs) {
        index++;
        TreeNode node = null;
        if(!strs[index].equals(".")){
            node=new TreeNode(Integer.valueOf(strs[index]));
            node.left=Deserialize(strs);
            node.right=Deserialize(strs);
        }
        return node;
    }
}