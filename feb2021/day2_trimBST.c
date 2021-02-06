/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* trimBST(struct TreeNode* root, int low, int high) {
    if (root == NULL) {
        return NULL;   

        // directly returning root also works, 
        // but time difference HUGE (20ms >> 8ms)
    }

    if (root->val < low) {
        root = trimBST(root->right, low, high);
    }
    else if (root->val > high) {
        root = trimBST(root->left, low, high);
    }
    else {
        root->left = trimBST(root->left, low, high);
        root->right = trimBST(root->right, low, high);
    }
    return root;
}