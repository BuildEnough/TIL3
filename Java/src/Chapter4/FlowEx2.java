package Chapter4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        input = Integer.parseInt(tmp);

        if(input==0){
            System.out.printf("입력한 문자는 0입니다");
        }
        if(input!=0){
            System.out.printf("입력한 문자는 0이 아니라 %d입니다", input);
        }
    }
}
