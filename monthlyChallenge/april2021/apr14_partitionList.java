// 100% / 83%

class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return head;

        ListNode pp = head, s = null;
        ListNode bhead = null, b = null;

        while (pp != null) {
            if (pp.val < x) {
                if (s == null) {
                    s = pp;
                    head = s;
                } else {
                    s.next = pp;
                    s = s.next;
                }
            } else {
                if (b == null) {
                    b = pp;
                    bhead = b;
                } else {
                    b.next = pp;
                    b = b.next;
                }
            }

            pp = pp.next;
        }

        if (b != null)
            b.next = null;
        if (s != null)
            s.next = bhead;

        return head;
    }
}