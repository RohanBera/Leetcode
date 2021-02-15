class Solution {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int[] visited = new int[len];

        for (int i = 0; i < len; i++) {
            if (visited[i] != 0)
                continue;

            Queue<Integer> q = new LinkedList<Integer>();
            q.add(i);
            visited[i] = 1;

            while (!q.isEmpty()) {
                int curr = q.poll();
                for (int j : graph[curr]) {
                    if (visited[j] == 0) {
                        visited[j] = -visited[curr];
                        q.add(j);
                    }

                    if (visited[j] == visited[curr]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
