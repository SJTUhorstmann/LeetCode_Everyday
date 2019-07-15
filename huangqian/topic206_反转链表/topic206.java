public ListNode reverseList(ListNode head) {
    //使用p和q两个指针配合工作，使得两个节点间的指向反向
    // 同时用r记录剩下的链表。
    if(head==null||head.next==null) return head;
    ListNode p=head;
    ListNode q=head.next;
    p.next=null;//p反向
    while (q!=null){
        ListNode r=q;
        r=r.next;
        q.next=p;
        p=q;
        q=r;
    }
    return p;
}