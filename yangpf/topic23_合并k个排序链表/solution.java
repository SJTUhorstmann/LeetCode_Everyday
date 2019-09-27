//暴力解法：
//执行用时 :462 ms, 在所有 Java 提交中击败了8.79%的用户
//内存消耗 :58 MB, 在所有 Java 提交中击败了11.21%的用户
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode dummyHead=new ListNode(-1);
        ListNode cur=dummyHead;
        while(true){
            int min=Integer.MAX_VALUE;
            ListNode node=null;
            int index=-1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null){
                    if(lists[i].val<min){
                        node=lists[i];
                        index=i;
                        min=lists[i].val;
                    }
                }
            }
            if(node==null){
                break;
            }
            cur.next=new ListNode(min);
            cur=cur.next;
            node=node.next;
            lists[index]=node;
        }
        return dummyHead.next;
    }
}
//优先队列
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode dummyHead=new ListNode(-1);
        ListNode cur=dummyHead;
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode node1,ListNode node2){
                return node1.val-node2.val;
            }
        });
        for(ListNode listNode:lists){
            if(listNode!=null){
                pq.add(listNode);
            }
        }
        while(!pq.isEmpty()){
            ListNode nextNode=pq.poll();
            cur.next=new ListNode(nextNode.val);
            cur=cur.next;
            if(nextNode.next!=null){
                pq.add(nextNode.next);
            }
        }
        return dummyHead.next;
    }
}