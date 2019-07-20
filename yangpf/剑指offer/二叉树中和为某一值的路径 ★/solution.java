public class Solution {
    //ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        DFS(res,root,target,list);
        return res;
    }
    public void DFS(ArrayList<ArrayList<Integer>> res,TreeNode root,int target,ArrayList<Integer> list){
        if(target<0 || root==null)    return;
        list.add(root.val);
        if(target==root.val && root.left==null && root.right==null){
            ArrayList<Integer> temp=new ArrayList<>(list);
            res.add(temp);
            list.remove(list.size()-1);
            return;
        }else{
            //list.add(root.val);
            DFS(res,root.left,target-root.val,list);
            DFS(res,root.right,target-root.val,list);
            list.remove(list.size()-1);
        }
    }
}