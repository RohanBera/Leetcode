// 14% / 0%

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> s = new HashSet<ListNode>();

        while (headA != null) {
            s.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (s.contains(headB))
                return headB;

            headB = headB.next;
        }

        return null;
    }
}