public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }
    public OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }
    public void add(int index, T element) {
        add(element);
    }
    public boolean add(T e) throws IllegalArgumentException{
        if (e == null) {
            throw new IllegalArgumentException("cannot accept null value");
        }
        if (size() == 0) {
            super.add(e);
            return true;
        }
        for (int i = 0; i < (size() - 1); i++) {
            if (get(i).compareTo(e) <= 0 && e.compareTo(get(i+1)) <= 0) {
                super.add(i+1,e);
                return true;
            }
        }
        if (e.compareTo(get(0)) < 0) {
            super.add(0,e);
            return true;
        }
        if (e.compareTo(get(size()-1)) > 0) {
            super.add(e);
            return true;
        }
        return true;
    }
    public T set(int index, T element) throws IllegalArgumentException {
        if (element == null) {
            throw new IllegalArgumentException("cannot accept null value");
        }
        T result = get(index);
        remove(index);
        add(element);
        return result;
    }
}