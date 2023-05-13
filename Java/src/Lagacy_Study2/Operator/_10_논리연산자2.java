package Operator;

import java.util.Scanner;

public class _10_논리연산자2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = ' ';

        System.out.printf("문자 입력:");

        String input = sc.nextLine();
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.println("입력한 문자는 숫자입니다");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력한 문자는 영문자입니다");
        }
    }
}
