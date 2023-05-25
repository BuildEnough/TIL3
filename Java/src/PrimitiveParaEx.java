class Data { int x; }

public class PrimitiveParaEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x); // 10

        change(d);
        System.out.println(d.x);// 1000

    }
    static void change(Data d) { // 참조형 매개변수
        d.x = 1000;
        System.out.println("chage: " + d.x); // chage: 1000
    }
}
