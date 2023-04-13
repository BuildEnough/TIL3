package ObjectOrientedProgramming;

class Data { int x;}
public class _9_참조형_매개변수1 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        change(d.x);
        System.out.println(d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change");
        System.out.println(x);
    }
}
