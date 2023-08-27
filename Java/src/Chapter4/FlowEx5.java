package Chapter4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        score = Integer.parseInt(tmp);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
                grade = 'B';
                if (score >= 88) {
                    opt = '+';
                } else if (score < 84) {
                    opt = '-';
                }
            } else {
                grade = 'C';
        }
        System.out.printf("학점: %c%c", grade, opt);
    }
}
