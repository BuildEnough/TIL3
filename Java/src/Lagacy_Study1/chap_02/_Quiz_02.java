package Lagacy_Study1.chap_02;

public class _Quiz_02 {
    /*
    어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오
    - 키가 120cm 이상인 경우에만 탑승 가능
    - 삼항 연산자 이용
    */
    public static void main(String[] args) {
        int height = 121;
        String result = (height > 120) ? ("키가 " + height + "이므로 탑승 가능합니다") : ("키가 " + height + "이므로 탑승 불가능합니다");
        System.out.println(result);

    }
}
