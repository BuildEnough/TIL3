package algorithm;

import java.util.Scanner;

public class _2566_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int MAX_num = 0;
        int x = 0, y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();

                if(arr[i][j] > MAX_num) {
                    MAX_num = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(MAX_num);
        System.out.print((x+1) + " " + (y+1));

    }
}
