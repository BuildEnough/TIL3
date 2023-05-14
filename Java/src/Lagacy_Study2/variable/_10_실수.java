package Lagacy_Study2.variable;

public class _10_실수 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890;

        System.out.printf("%f%n", f); // 6자리까지 출력
        System.out.printf("%24.20f%n", f); // 저장공간의 한계, 앞의 6자리만 오차없이 출력
        System.out.printf("%24.20f%n", d);

    }
}
