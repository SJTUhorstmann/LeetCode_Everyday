public void deleteNode(ListNode node) {
    //输入的是需要删除的节点
    node.val=node.next.val;
    node.next=node.next.next;
}