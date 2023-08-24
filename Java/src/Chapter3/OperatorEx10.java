package Chapter3;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1_000_000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.println(result1);
        System.out.println(result2);
    }
}
