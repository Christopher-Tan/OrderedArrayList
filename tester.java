public class tester {
    public static void main(String[] args) {
        NoNullArrayList a = new NoNullArrayList<String>();
        a.add("Hi");
        a.add("Mn");
        try {
            a.add(0,null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(a);
        System.out.println(a.add("String"));
        try {
            a.add(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(a);
        System.out.println(a.set(1,"Hi"));
        try {
            a.set(2,null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(a);
        NoNullArrayList b = new NoNullArrayList<NoNullArrayList>(20);
        b.add(a);
        b.add(b);
        System.out.println(b);
        OrderedArrayList c = new OrderedArrayList<Integer>();
        int[] d = {1,5,3,4,6,2,9,2,20};
        for (int i = 0; i < d.length; i++) {
            c.add(d[i]);
        }
        System.out.println(c);
        OrderedArrayList e = new OrderedArrayList<Integer>();
        for (int i = 0; i < d.length; i++) {
            e.add(10,d[i]);
        }
        System.out.println(e);
    }
}