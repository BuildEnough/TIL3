package Chapter4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0) {
            sum += num % 10;

            num /= 10;
        }
        System.out.println(sum);
    }
}
