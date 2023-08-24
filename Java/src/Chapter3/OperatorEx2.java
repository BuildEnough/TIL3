package Chapter3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.printf("%d, %d%n", i, j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.printf("%d, %d", i, j);

    }
}
