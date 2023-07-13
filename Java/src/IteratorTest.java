import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new TreeSet(); // Set은 Collcetion의 자손
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}