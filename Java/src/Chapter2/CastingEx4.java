package Chapter2;

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float)i;
        int i2 = (int)f;

        double d = (double)i;
        int i3 = (int)d;

        float f2 = 1.666f;
        int i4 = (int)f2;

        System.out.printf("%d%n", i);
        System.out.printf("%f %d%n", f, i2);
        System.out.printf("%f %d%n", d, i3);
        System.out.printf("%f %d%n", f2, i4);
    }
}
