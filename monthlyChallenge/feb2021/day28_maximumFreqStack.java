// 37% / 75%

class FreqStack {
    private HashMap<Integer, Integer> ft = null;
    private PriorityQueue<Node> pq = null;
    private int len = 0;

    public FreqStack() {
        ft = new HashMap<Integer, Integer>();
        pq = new PriorityQueue<Node>();
    }

    public void push(int x) {
        if (ft.containsKey(x))
            ft.replace(x, ft.get(x) + 1);
        else
            ft.put(x, 1);

        pq.offer(new Node(x, ft.get(x), len++));
    }

    public int pop() {
        int temp = pq.remove().val;

        int freq = ft.get(temp);

        if (freq == 1)
            ft.remove(temp);
        else
            ft.replace(temp, ft.get(temp) - 1);

        return temp;
    }

    class Node implements Comparable<Node> {
        int val;
        int freq;
        int index;

        public Node(int v, int f, int i) {
            this.val = v;
            this.freq = f;
            this.index = i;
        }

        public int compareTo(Node node) {
            if (this.freq == node.freq)
                return node.index - this.index;

            return node.freq - this.freq;
        }
    }
}