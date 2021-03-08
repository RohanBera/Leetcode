// 65% / 65%

class MyHashMap {
    int[] hash;

    public MyHashMap() {
        hash = new int[1000001];
        Arrays.fill(hash, -1);
    }

    public void put(int key, int val) {
        hash[key] = val;
    }

    public int get(int key) {
        return hash[key];
    }

    public void remove(int key) {
        hash[key] = -1;
    }
}