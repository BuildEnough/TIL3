package algorithm;

import java.util.Scanner;

public class _5086_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int f = sc.nextInt();
            int s = sc.nextInt();

            if (s == 0 && f == 0) break;

            if (s % f == 0) {
                System.out.println("factor");
            } else if (f % s == 0) {
                System.out.println("multiple");
            } else
                System.out.println("neither");
        }
    }
}
