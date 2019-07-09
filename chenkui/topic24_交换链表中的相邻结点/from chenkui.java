﻿/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode next=head.next.next;
        ListNode node=head.next;
        node.next=head;
        node.next.next=swapPairs(next);
        return node;
        
    }
}