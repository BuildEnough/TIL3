package Lagacy_Study2.Loop;

public class _9_break문 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100) break;
            ++i;
            sum += i;
        }
        System.out.println(i);
        System.out.println(sum);
    }
}
