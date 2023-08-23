package Chapter2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int num = Integer.parseInt(input);

        System.out.println(input);
        System.out.println(num);
    }
}
