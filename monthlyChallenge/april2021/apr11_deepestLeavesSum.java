class Solution {
    int sol;

    public int dfs(TreeNode n) {
        if (n == null)
            return 0;

        return (Math.max(dfs(n.left), dfs(n.right)) + 1);
    }

    public void sum(TreeNode n, int k) {
        if (n == null) {
            return;
        }
        if (k == 0) {
            sol += n.val;
            return;
        } else {
            sum(n.left, k - 1);
            sum(n.right, k - 1);
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        int d = dfs(root);
        sol = 0;
        sum(root, d - 1);
        return sol;

    }
}