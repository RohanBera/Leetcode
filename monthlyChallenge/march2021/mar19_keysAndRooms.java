// 85.85% / 85.76%

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int c = 1;
        Queue<Integer> q = new LinkedList<Integer>();
        int n = rooms.size();
        int[] visited = new int[n];

        for (int key : rooms.get(0))
            q.add(key);
        visited[0] = 1;

        while (!q.isEmpty() && c < n) {
            int i = q.poll();

            if (visited[i] == 0) {
                visited[i] = 1;
                for (int key : rooms.get(i))
                    if (visited[key] == 0)
                        q.add(key);
                c++;
            }
        }

        if (c == n)
            return true;

        return false;
    }
}