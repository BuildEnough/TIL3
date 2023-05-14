package Lagacy_Study2.Operator;

public class _7_비교연산자 {
    public static void main(String[] args) {
        System.out.println(10 == 10.0f); // float로 변환
        System.out.println('0' == 0);
        System.out.println('A' == 65);

        System.out.println('\n');

        System.out.println('A' > 'B');
        System.out.println('A' < 'B');

        System.out.println('\n');

        System.out.println('A'+ 1 != 'B');
        System.out.println('A'+ 1 == 'B');

        System.out.println('\n');

        System.out.println();

        System.out.println(10.0 == 10.0f); // 10.0f는 오차없이 저장 가능
        System.out.println(0.1 == 0.1f); // 정수형과 달리 실수형은 근사값으로 저장되므로 오차 발생
    }
}
