package Chapter4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score;
        char grade = ' ';

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(grade);
    }
}
