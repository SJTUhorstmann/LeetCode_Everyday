public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right!=null){
            TreeLinkNode right=pNode.right;
            while(right.left!=null){
                right=right.left;
            }
            return right;
        }else{
            if(pNode.next==null)    return null;
            if(pNode==pNode.next.left)    return pNode.next;
            else{
                TreeLinkNode father=pNode.next;
                while(father.next!=null){
                    if(father==father.next.left){
                        return father.next;
                    }
                    father=father.next;
                }
                return null;
            }
        }
    }
}