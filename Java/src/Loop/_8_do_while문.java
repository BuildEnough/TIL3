package Loop;

import java.util.Scanner;

public class _8_do_while문 {
    public static void main(String[] args) {
        int input = 0;
        int answer = 0;

        answer = (int) (Math.random() * 100 + 1); // 1 ~ 100 사이의 수
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수 입력: ");
            input = sc.nextInt();

            if (input > answer) {
                System.out.println("작은 수로 재시도");
            } else if (input < answer) {
                System.out.println("큰 수로 재시도");
            }
        } while (input != answer);
        System.out.println("정답");
    }
}
