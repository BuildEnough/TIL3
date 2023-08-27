package Chapter4;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0) {
            System.out.println("입력한 숫자는 0");
        } else {
            System.out.println("입력한 숫자는 0이 아님");
        }
    }
}
