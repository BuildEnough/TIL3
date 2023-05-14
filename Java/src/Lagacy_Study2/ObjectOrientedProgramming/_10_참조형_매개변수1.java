package Lagacy_Study2.ObjectOrientedProgramming;

class Data2 { int x;}
public class _10_참조형_매개변수1 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println(d.x);

        change(d);
        System.out.println(d.x);
    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("change");
        System.out.println(d.x);
    }
}
