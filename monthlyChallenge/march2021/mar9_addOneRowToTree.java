// 100% / 98.63%

class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1)
            return new TreeNode(v, root, null);

        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        int dep = 1;
        q1.add(root);

        while (!q1.isEmpty()) {
            int s = q1.size();
            dep++;

            if (dep == d) {
                for (int i = 0; i < s; i++) {
                    TreeNode temp = q1.poll();
                    temp.left = new TreeNode(v, temp.left, null);
                    temp.right = new TreeNode(v, null, temp.right);
                }

                return root;
            }

            for (int i = 0; i < s; i++) {
                TreeNode temp = q1.poll();

                if (temp.left != null)
                    q1.add(temp.left);

                if (temp.right != null)
                    q1.add(temp.right);
            }
        }

        return root;
    }
}