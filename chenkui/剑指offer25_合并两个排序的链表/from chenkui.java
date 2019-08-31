/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/*
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
             return list2;
        }
		if(list2==null){
            return list1;
        } 
		if(list1.val>list2.val){
			ListNode list=list2;
			list.next=Merge(list1,list2.next);
			return list;
		}
		else{
			ListNode list=list1;
			list.next=Merge(list1.next,list2);
			return list;
		}
    }
}
*/

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
             return list2;
        }
		if(list2==null){
            return list1;
        } 
        ListNode result=new ListNode(0);
        ListNode result1=result;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                result.next=list2;
                list2=list2.next;
                result=result.next;
            }
            else{
                result.next=list1;
                list1=list1.next;
                result=result.next;
            }
        }
		if(list1==null){
            result.next=list2;
        }
        else{
            result.next=list1;
        }
        return result1.next;
    }
}