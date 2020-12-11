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
    }
}