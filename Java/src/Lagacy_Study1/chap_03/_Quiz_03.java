package Lagacy_Study1.chap_03;

public class _Quiz_03 {
    // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오

    /*
    주민등록번호는 13자리 숫자로 구성
    앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
    입력 데이터는 -를 포함한 14자리 문자열 형태
    */
    public static void main(String[] args) {
        String jumin = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(jumin.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        jumin = "030708-4567890";
        System.out.println(jumin.substring(0, jumin.indexOf("-") + 2)); // 0 위치부터 하이픈(-) 위치 + 2 직전까지
    }
}
