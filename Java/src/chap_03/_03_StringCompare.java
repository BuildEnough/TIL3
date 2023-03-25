package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234"; // 비밀번호 정보 (참조) / ex) 카페 와이파이 비밀번호 메모지 1개만 벽에 붙여둠
        s2 = "1234"; // 비밀번호 정보 (참조) / ex) 카페 와이파이 비밀번호 메모지 1개만 벽에 붙여둠
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (참조 비교)

        s1 = new String("1234"); // ex) 카페 각각의 손님에게 와이파이 비밀번호 적어서 줌
        s2 = new String("1234"); // ex) 카페 각각의 손님에게 와이파이 비밀번호 적어서 줌
        System.out.println(s1.equals(s2)); // true / Java에서 문자열의 내용을 비교하고 싶을 경우 equals 사용
        System.out.println(s1 == s2); // false

    }
}
