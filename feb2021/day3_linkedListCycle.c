/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    
    //  empty and single node LLs, no loops 
    
    if (head == NULL || head->next == NULL) {
        return false;
    }
    
    struct ListNode* slow = head; 
    struct ListNode* fast = head;
    
    while (slow && fast && fast->next) {
        slow = slow->next;
        fast = fast->next->next;
        
        if (slow == fast) {
            return true;
        }
    }
    return false;
}