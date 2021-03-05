// 100% / 99.68% 

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Double> sol = new ArrayList<Double>();
        q.add(root);

        while (!q.isEmpty()) {
            int len = q.size();
            long sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode temp = q.poll();
                sum += temp.val;

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }
            sol.add((double) sum / len);
        }

        return sol;
    }
}