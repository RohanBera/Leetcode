//54.59% / 85.67%

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        int s = -1, e = -1;
        while (temp != null) {
            len++;
            if (len == k)
                s = temp.val;
            temp = temp.next;
        }

        temp = head;
        for (int i = 1; i <= len - k; i++) {
            temp = temp.next;
        }
        e = temp.val;
        temp.val = s;

        temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        temp.val = e;

        return head;
    }
}

// attempt 2 : 76.81% / 85.67%

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        ListNode s = null;
        int e = -1;

        while (temp != null) {
            len++;
            if (len == k)
                s = temp;
            temp = temp.next;
        }

        temp = head;
        for (int i = 1; i <= len - k; i++) {
            temp = temp.next;
        }
        e = temp.val;
        temp.val = s.val;
        s.val = e;

        return head;
    }
}