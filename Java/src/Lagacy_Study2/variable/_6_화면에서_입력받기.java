package Lagacy_Study2.variable;

import java.util.Scanner;

public class _6_화면에서_입력받기 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in); // Scanner 객체의 클래스 생성

        System.out.print("정수를 입력해주세요: ");

        String str = sc.nextLine(); // 입력 받은 내용을 str에 저장
        int num = Integer.parseInt(str); // 입력받은 내용을 int 타입의 값으로 변환

        System.out.println(str);
        System.out.print(num);

    }
}
