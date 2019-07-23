��ֱ�ӵ�����������ÿ����㣬����һ����ȡ����ȵĵݹ麯�������ݸý������������߶Ȳ��ж��Ƿ�ƽ�⣬Ȼ��ݹ�ض��������������жϡ�


public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)    return true;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)
            && Math.abs(getDepth(root.left)-getDepth(root.right))<=1;
    }
    public int getDepth(TreeNode node){
        if(node==null)    return 0;
        return Math.max(getDepth(node.left),getDepth(node.right))+1;
    }
}



���������к����Ե����⣬���ж��ϲ����ʱ�򣬻����ظ������²��㣬�����˲���Ҫ�Ŀ����������Ϊ�������ϱ��������������ƽ����������򷵻������ĸ߶ȣ����������������ƽ�����������ֱ��ֹͣ��������������ֻ��ÿ��������һ�Ρ�


public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }
     
    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        if (left == -1) return -1;
        int right = getDepth(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }
}