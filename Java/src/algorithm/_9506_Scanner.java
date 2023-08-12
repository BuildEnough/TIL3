package algorithm;

import java.util.Scanner;

public class _9506_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            int n = scan.nextInt();
            if(n == -1)
                break;

            int[] arr = new int[n]; // 약수 담을 배열
            int sum = 0;			// 약수들의 합
            int index = 0;			// 약수 담을 배열의 인덱스
            for(int i=1; i<n; i++) {
                if(n%i == 0) {		// 약수일 때
                    arr[index++] = i;	// 약수 저장
                    sum += i;			// 약수 합
                }
            }

            if(sum != n) {
                System.out.println(n + " is NOT perfect.");
                continue;
            }

            System.out.print(n + " = ");
            for(int i=0; i<index; i++) {
                if(i == index-1)
                    System.out.print(arr[i]);
                else
                    System.out.print(arr[i] + " + ");
            }
            System.out.println();
        }

        scan.close();
    }

}