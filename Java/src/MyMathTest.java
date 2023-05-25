public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.printGugudan(6);
    }

}

class MyMath {
    void printGugudan(int dan) {
        if (!(2<=dan && dan <=9)){
            return; // 입력받은 값이 2~9가 아니면, 메서드 종료 후 돌아가기
        }


        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
        // return; // return문 생략 가능
    }
}