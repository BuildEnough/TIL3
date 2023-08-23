package LagacyStudy3;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        int result = mm.max(5, 3);

        System.out.println(result);
    }

}

class MyMath {
    int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }
}