package Lagacy_Study2.ObjectOrientedProgramming;

public class _11_참조형_매개변수2 {
    public static void main(String[] args) {
        int[] x = {10};
        System.out.println(x[0]);

        change(x);
        System.out.println("change");
        System.out.println(x[0]);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println(x[0]);
    }
}
