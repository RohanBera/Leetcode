// 97% / 75% 

public class NestedIterator implements Iterator<Integer> {
    Queue<Integer> q;

    public NestedIterator(List<NestedInteger> nestedList) {
        q = new LinkedList<Integer>();

        flatten(nestedList);
    }

    public void flatten(List<NestedInteger> nestedList) {
        for (NestedInteger nl : nestedList) {
            if (nl.isInteger())
                q.add(nl.getInteger());
            else
                flatten(nl.getList());
        }
    }

    @Override
    public Integer next() {
        return q.poll();
    }

    @Override
    public boolean hasNext() {
        return q.size() > 0 ? true : false;
    }
}