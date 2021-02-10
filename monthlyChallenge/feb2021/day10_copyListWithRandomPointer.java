/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return head;
        
        Node curr = head;
        HashMap<Node, Node> mappedList = new HashMap<Node, Node>();
        
        while (curr != null) {
            Node newNode = new Node(curr.val);
            mappedList.put(curr, newNode);
            
            curr = curr.next;
        }
        
        curr = head;
        while (curr != null) {
            mappedList.get(curr).next = mappedList.get(curr.next);
            mappedList.get(curr).random = mappedList.get(curr.random);
            
            curr = curr.next;
        }
        
        return mappedList.get(head);
    }
}