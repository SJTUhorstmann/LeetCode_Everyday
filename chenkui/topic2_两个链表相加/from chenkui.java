class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int add=0;
      ListNode list=new ListNode(0);
      ListNode list1=list;
      while(l1!=null || l2!=null || add!=0){
        if(l1!=null){
          add=add+l1.val;
          l1=l1.next;
        }
        if(l2!=null){
          add=add+l2.val;
          l2=l2.next;
        }
        list.next=new ListNode(add%10);
        add=add/10;
        list=list.next;
      }
      return list1.next;
      
    }
}