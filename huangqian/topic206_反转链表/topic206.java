public ListNode reverseList(ListNode head) {
    //ʹ��p��q����ָ����Ϲ�����ʹ�������ڵ���ָ����
    // ͬʱ��r��¼ʣ�µ�����
    if(head==null||head.next==null) return head;
    ListNode p=head;
    ListNode q=head.next;
    p.next=null;//p����
    while (q!=null){
        ListNode r=q;
        r=r.next;
        q.next=p;
        p=q;
        q=r;
    }
    return p;
}