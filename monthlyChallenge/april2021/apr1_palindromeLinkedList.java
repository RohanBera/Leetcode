class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;

        ListNode s = head, f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        ListNode prev = s, curr = s.next;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while (head != s) {
            if (head.val != prev.val)
                return false;

            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}