import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(10); // list.add(new Integer(10));
        list.add(20);
        list.add("30");

        String i = (String)list.get(2);

        System.out.println(list);
    }
}
