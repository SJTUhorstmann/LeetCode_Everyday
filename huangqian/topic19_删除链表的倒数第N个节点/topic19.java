public ListNode removeNthFromEnd(ListNode head, int n) {
//ɾ��������n���ڵ�
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
    return pre.next;//head�����Ǳ�ɾ���ĵ㣬���Է���pre.next
}