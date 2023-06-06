class Point { // 2차원
    int x;
    int y;

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point { // 3차원
    int z;

    String getLocation() { // 오버라이딩
        return "x :" + x + ", y :" + y + ", z: " + z;
    }
}

public class overrideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());
    }
}
