/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int cntnum = 1;
    private int maxnum = 1;
    private TreeNode preNode = null;
    public int[] findMode(TreeNode root) {
        List<Integer> maxCntNums = new ArrayList<>();
        inOrder(root,maxCntNums);
        int[] ret = new int[maxCntNums.size()];
        int cnt = 0;
        for(int num:maxCntNums){
            ret[cnt++]=num;
        }
        return ret;
    }
    public void inOrder(TreeNode root, List<Integer> maxCntNums){
        if(root==null)
            return;
        inOrder(root.left,maxCntNums);
        if(preNode!=null){
            if(preNode.val==root.val){
                cntnum++;
            }else{
                cntnum=1;
            }
        }
        if(cntnum>maxnum){
            maxnum = cntnum;
            maxCntNums.clear();
            maxCntNums.add(root.val);
        }else if(cntnum==maxnum){
            maxCntNums.add(root.val);
        }
        preNode = root;
        inOrder(root.right,maxCntNums);    
    }
}