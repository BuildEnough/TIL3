package algorithm;

import java.util.Scanner;

public class _2501_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) count++;
            if(count == k) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}