public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public void add(int index, T element) {
        add(element);
    }
    public boolean add(T e) {
        boolean found = false;
        for (int i = 0; i < (size() - 1) && !found; i++) {
            if (get(i).compareTo(e) <= 0 && e.compareTo(get(i+1)) <= 0) {
                found = true;
                super.add(i+1,e);
            }
        }
        if (!found) {
            super.add(e);
        }
        return true;
    }
}