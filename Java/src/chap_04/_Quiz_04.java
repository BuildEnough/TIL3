package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오


        /* 조건
        주차요금은 시간 당 4000원 (일일 최대 요금은 30000원)
        경차 또는 장애인 차량은 최종 요금에서 50% 할인
        */

        /* 주차요금 예시
        일반 차량 5시간 주차 시 20000원
        경차 5시간 주차 시 10000원
        장애인 차량 10시간 주차 시 15000원
        */

        int hour = 5; // 주차 시간
        boolean isSmallCar = false; // 경차
        boolean jangain = true; // 장애인 차량
        int fee = hour * 4000;

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000)
            fee = 30000; // 일일 최대 요금 적용

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || jangain)
            fee *= 0.5; // 50% 할인 적용
            // fee /= 2;
            // fee = (int) (fee * 0.5f);
            // fee *= 0.5f;

        System.out.println("주차 요금은 " + fee + "원 입니다.");

    }
}
