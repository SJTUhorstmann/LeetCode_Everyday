public ListNode removeNthFromEnd(ListNode head, int n) {
//删除倒数第n个节点
    ListNode pre = new ListNode(0);
    pre.next = head;
    ListNode p1 = pre;
    ListNode p2 = pre;
    for(int i=0;i<n;i++){
        p1=p1.next;
    }
    while (p1.next!=null){
        p1=p1.next;
        p2=p2.next;
    }
    p2.next=p2.next.next;
    return pre.next;//head可能是被删掉的点，所以返回pre.next
}