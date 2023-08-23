package LagacyStudy3;

class Data_1 {
    int value;
    // LagacyStudy3.Data_1() {} // 기본 생성자 추가, 하지만 주석 처리해도 상관없음
}

class Data_2 {
    int value;

    Data_2() {} // 기본 생성자
    Data_2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
    }
}
