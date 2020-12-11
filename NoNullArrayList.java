import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    public void add(int index, T element) throws IllegalArgumentException {
        if (element == null) {
            throw new IllegalArgumentException("cannot accept null value");
        }
        super.add(index,element);
    }
}