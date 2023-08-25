package Chapter3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        String input  = sc.nextLine();
        ch = input.charAt(0);

        if(ch >= '0' && ch <= '9') {
            System.out.println("숫자");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("영문자");
        }

    }
}
