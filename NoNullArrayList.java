import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList() {
        super();
    }
    public NoNullArrayList(int initialCapacity) {
        super(initialCapacity);
    }
    public void add(int index, T element) throws IllegalArgumentException {
        if (element == null) {
            throw new IllegalArgumentException("cannot accept null value");
        }
        super.add(index,element);
    }
    public boolean add(T e) throws IllegalArgumentException {
        if (e == null) {
            throw new IllegalArgumentException("cannot accept null value");
        }
        return super.add(e);
    }
    public T set(int index, T element) throws IllegalArgumentException {
        if (element == null) {
            throw new IllegalArgumentException("cannot accept null value");
        }
        return super.set(index,element);
    }
}