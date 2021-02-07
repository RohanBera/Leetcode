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
 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) 
            return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> ans = new ArrayList<> ();
        
        while (q.size() > 0) {
            int nodes = q.size();
            int val = 0;
            
            for (int i = 0; i < nodes; i++) {
                TreeNode node = q.poll();
                val = node.val;
                
                if (node.left != null) {
                    q.add(node.left);
                }
                
                if (node.right != null) {
                    q.add(node.right);
                }                
            }
            ans.add(val);
        }
        return ans;
    }
}