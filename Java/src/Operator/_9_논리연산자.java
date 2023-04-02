package Operator;

public class _9_논리연산자 {
    public static void main(String[] args) {
        System.out.println(3 < 5 || 4 < 5);
        System.out.println(3 < 5 || 4 > 5);

        System.out.println('\n');

        System.out.println(3 < 5 && 4 < 5);
        System.out.println(3 < 5 && 4 > 5);

        System.out.println('\n');

        System.out.println((12 % 2 == 0 || 12 % 3 == 0) && 12 % 6 == 0); // 12는 2의배수 또는 3의 배수이지만 6의 배수는 아니다
        // &&가 ||보다 우선순위가 높기 떄문에 ()를 사용해 주어야 한다
    }
}
