package LagacyStudy3;

class Data { int x; }

public class PrimitiveParaEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x); // 10

        change(d.x);
        System.out.println(d.x);// 10

    }
    static void change(int d) { // 기본형 매개변수
        d = 1000;
        System.out.println("chage: " + d); // chage: 1000
    }
}
