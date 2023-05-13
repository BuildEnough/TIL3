package Loop;

public class _1_for문 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0, j = 9; i < 10; i++, j--) {
            System.out.printf("%d, %d%n", i, j);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, %d%n", i, 10-i);
        }
    }
}
