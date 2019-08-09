/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
*/ 

//方法1 

/*
class Solution {
    List<Integer> list=new ArrayList<Integer>();
    public boolean findTarget(TreeNode root, int k) {
      if(root==null){
         return false; 
      } 
      findTarget(root);
        
      int high=list.size()-1;
      int[] arr=new int[high+1];
      for(int i=0;i<=high;i++){
        arr[i]=list.get(i);
      }
        
      Arrays.sort(arr);
      int low=0;
      while(low<high){
        int tem=arr[low]+arr[high];
        if(tem==k) return true;
        if(tem<k) low++;
        if(tem>k) high--;
      }
        
      return false;
    }
    
    private void findTarget(TreeNode root){
      if(root==null){
         return; 
      } 
        
      list.add(root.val);
      findTarget(root.left);
      findTarget(root.right);   
    }
}

*/

//方法2

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
            
        return findTargetHelper(root, root, k);
    }
    
    public boolean findTargetHelper(TreeNode root, TreeNode curr, int k){
        if(root == null){
            return false;
        }
            
        return ((curr != null && searchRemaining(root, curr, k - curr.val)) || 
            curr != null && findTargetHelper(root, curr.left, k) || 
            curr != null && findTargetHelper(root, curr.right, k));
    }

    public boolean searchRemaining(TreeNode root, TreeNode curr, int target){
        if(root == null){
            return false;
        }
            
        return ((target == root.val && curr != root) ||
                ((target > root.val) && searchRemaining(root.right, curr, target))
                || ((target < root.val) && searchRemaining(root.left, curr, target)));
            
    }
}