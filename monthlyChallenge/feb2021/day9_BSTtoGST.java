/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// did iteration this time instead of recursion, 
// and apparantly its more timetaking than recursion 
//  -_-  //

class Solution {
    public TreeNode convertBST(TreeNode root) {
        if (root == null) 
            return null;

        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode curr = root;
        int sum = 0;
        
        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.push(curr);
                curr = curr.right;
            }
            curr = s.pop();
                
            curr.val = curr.val + sum;
            sum = curr.val;
            
            curr = curr.left;
        }
        
        return root;
    }
}