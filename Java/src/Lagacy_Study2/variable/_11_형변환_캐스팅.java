package Lagacy_Study2.variable;

public class _11_형변환_캐스팅 {
    public static void main(String[] args) {
        double d = 85.4;
        int num = (int)d;

        System.out.println(d);
        System.out.println(num);

        int i = 91234567;
        float f = (float)i;
        int i2 = (int)f;

        double dou = (double)i;
        int i3 = (int)dou;

        System.out.println(i);
        System.out.println(f);
        System.out.println(i2);
        System.out.println('\n');

        System.out.println(dou);
        System.out.println(i3);
    }
}
