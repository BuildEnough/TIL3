class Data_1 {
    int value;
}

class Data_2 {
    int value;
    Data_2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        // Data_2 d2 = new Data_2(); // compile error 발생
    }
}
