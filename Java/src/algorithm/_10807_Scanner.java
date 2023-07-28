package algorithm;

import java.util.Scanner;

public class _10807_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] += sc.nextInt();
        }

        int index = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == index){
                count++;
            }
        }
        System.out.println(count);
    }
}
