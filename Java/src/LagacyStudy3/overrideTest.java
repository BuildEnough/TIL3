package LagacyStudy3;

class Point extends Object {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "x :" + x + ", y :" + y;
    }
}

public class overrideTest {
    public static void main(String[] args) {
        Point p = new Point(3, 5);
//        p.x = 3;
//        p.y = 5;

        System.out.println(p);
//        System.out.println(p.toString());
//        System.out.println(p.x);
//        System.out.println(p.y);
    }
}
