package Loop;

public class _4_구구단 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        }
    }
}
