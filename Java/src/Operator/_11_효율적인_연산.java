package Operator;

public class _11_효율적인_연산 {
    public static void main(String[] args) {
        int a = 5, b = 0;

        System.out.printf("%d, %d%n", a, b);
        System.out.println(a != 0 || ++b != 0); //  or연산에서 좌측 피연산자가 false가 나왔으므로 우측 피연산자가 연산되지 않음
        System.out.printf("%d, %d%n", a, b);

        System.out.println(a == 0 && ++b != 0);
        System.out.printf("%d, %d%n", a, b);
    }
}
