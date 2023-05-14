package Lagacy_Study2.Operator;

public class _6_나머지 {
    public static void main(String[] args) {
        int x = 10, y = 8;

        System.out.println(x / y);
        System.out.println(x % y);

        System.out.println('\n');

        System.out.println(-10%8);
        System.out.println(10%8);
        System.out.println(-10%-8); // 나누는 수 부호 무시됨(-8)
    }
}
