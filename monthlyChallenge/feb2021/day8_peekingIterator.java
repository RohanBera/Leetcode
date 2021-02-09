// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    int cache;
    boolean cached = false;
	public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
	}
	
	public Integer peek() {
        if (!cached) {
            cached = true;
            cache = iterator.next();
        }
        return cache;
	}
	
	@Override
	public Integer next() {
        if (cached) {
            cached = false;
            return cache;
        }
 	    return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
        // 'or' neccesaary, for last element
	    return (iterator.hasNext() || cached);
	}
}