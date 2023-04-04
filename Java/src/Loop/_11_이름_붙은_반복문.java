package Loop;

public class _11_이름_붙은_반복문 {
    public static void main(String[] args) {
        Loop1 : for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5)
                    break Loop1;
                System.out.printf("%d x %d = %d%n", i, j ,i*j);
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5)
                    break;
                System.out.printf("%d x %d = %d%n", i, j ,i*j);
            }
        }

    }
}
