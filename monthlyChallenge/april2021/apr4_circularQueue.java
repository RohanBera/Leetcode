class MyCircularQueue {
    int[] q;
    int f;
    int b;
    int k;

    public MyCircularQueue(int size) {
        q = new int[size];
        k = size;
        Arrays.fill(q, -1);
        f = 0;
        b = k - 1;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;

        b = (b + 1) % k;
        q[b] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;

        q[f] = -1;
        f = (f + 1) % k;
        return true;
    }

    public int Front() {
        return q[f];
    }

    public int Rear() {
        return q[b];
    }

    public boolean isEmpty() {
        if ((b + 1) % k == f && q[f] == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if ((b + 1) % k == f && q[f] != -1)
            return true;
        else
            return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k); boolean param_1 =
 * obj.enQueue(value); boolean param_2 = obj.deQueue(); int param_3 =
 * obj.Front(); int param_4 = obj.Rear(); boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */