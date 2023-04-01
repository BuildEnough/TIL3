package Operator;

public class _5_반올림 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;

        System.out.println(shortPi);

        double pi2 = 3.141592;
        double shortPi2 = Math.round(pi2 * 1000) / 1000.0;

        System.out.println(shortPi2);
    }
}
