package Lagacy_Study2.Operator;

public class _8_문자열_비교 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println("abc" == "abc");
        System.out.println(str1 == "abc");
        System.out.println(str2 == "abc"); // 내용은 같지만 서로 다른 객체이기 때문에 false

        System.out.println('\n');

        System.out.println(str1.equals("abc"));
        System.out.println(str2.equals("abc"));

        System.out.println('\n');

        System.out.println(str1.equals("ABC"));
        System.out.println(str1.equalsIgnoreCase("ABC")); // 대소문자 구별하지 않고 비교
    }
}
