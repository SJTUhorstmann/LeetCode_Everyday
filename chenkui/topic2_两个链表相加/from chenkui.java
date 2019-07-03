class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    private ListNode add(ListNode l1, ListNode l2, int carry) {
        int val1 = l1 != null ? l1.val : 0;
        int val2 = l2 != null ? l2.val : 0;

        if (l1 == null && l2 == null) {
            return carry == 0 ? null : new ListNode(carry); 
        }

        int result = val1 + val2 + carry;
        int newCarry = 0;
        if (result >= 10) newCarry = 1;
        ListNode res = new ListNode(result % 10);
        ListNode nextL1 = l1 != null ? l1.next : null;
        ListNode nextL2 = l2 != null ? l2.next : null;
        res.next = add(nextL1, nextL2, newCarry);

        return res;
    }
}