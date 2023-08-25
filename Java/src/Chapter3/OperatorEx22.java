package Chapter3;

public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.println(10 == 10.0f);
        System.out.println(d == f);
        System.out.println(d2 == f);
        System.out.println((float)d == f);
        System.out.println(d == (double)f);
    }
}
