class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode head = null;
        ListNode tail = null;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                int sum = l2.val + carry;
                carry = sum / 10;

                if (head == null) {
                    head = new ListNode(sum % 10, null);
                    tail = head;
                } else {
                    tail.next = new ListNode(sum % 10, null);
                    tail = tail.next;
                }

                l2 = l2.next;
            }

            else if (l2 == null) {
                int sum = l1.val + carry;
                carry = sum / 10;

                if (head == null) {
                    head = new ListNode(sum % 10, null);
                    tail = head;
                } else {
                    tail.next = new ListNode(sum % 10, null);
                    tail = tail.next;
                }

                l1 = l1.next;
            }

            else {
                int sum = l1.val + l2.val + carry;
                carry = sum / 10;

                if (head == null) {
                    head = new ListNode(sum % 10, null);
                    tail = head;
                } else {
                    tail.next = new ListNode(sum % 10, null);
                    tail = tail.next;
                }

                l1 = l1.next;
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            tail.next = new ListNode(carry, null);
            tail = tail.next;
        }

        return head;
    }
}