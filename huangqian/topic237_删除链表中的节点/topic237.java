public void deleteNode(ListNode node) {
    //���������Ҫɾ���Ľڵ�
    node.val=node.next.val;
    node.next=node.next.next;
}