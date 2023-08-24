package Chapter3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * (long)b;
        System.out.println(c);

    }
}
