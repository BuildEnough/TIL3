class MyPoint extends Object {
    int x;
    int y;
}

class Circle extends Object { // 포함
    MyPoint p = new MyPoint();
    int r;
}


public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString()); // Circle@4c203ea1
        System.out.println(c); // Circle@4c203ea1

        Circle c2 = new Circle();
        System.out.println(c2.toString()); // Circle@27f674d
    }
}
