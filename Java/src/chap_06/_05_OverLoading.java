package chap_06;

public class _05_OverLoading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메서드 오버로딩: 같은 이름의 메소드를 여러 번 선언
        // 메서드 오버로딩 조건:
        // 1. 전달 값의 타입이 다르거나
        // 2. 전달 값의 개수가 다를 때
        // 반환형은 상관없음 public static int -> public static double 과 같은 경우 안됨유
        // 전달값의 타입, 자료형, 전달값의 개수가 다를 때 똑같은 이름의 메서드를 중복해서 선언 가능
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
        // 이름은 똑같지만 전달값의 자료형이 다른 메서드를 각각 호출함
    }
}
