public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //合并两个有序链表
    // 可以用递归来做
    ListNode ans=null;
    if(l1==null) return l2;
    if(l2==null) return l1;
    if(l1.val<=l2.val){
        ans=l1;
        ans.next=mergeTwoLists(l1.next,l2);
    }else if (l1.val>l2.val){
        ans=l2;
        ans.next=mergeTwoLists(l1,l2.next);
    }
    return ans;
}