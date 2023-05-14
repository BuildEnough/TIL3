package Lagacy_Study2.variable;

public class _5_실수값_지시자 {
    public static void main(String[] args) {
        String alpa = "ABCDEFGHIGKLMNOPQRSTUVWXYZZ";

        float f1 = .10f;
        double d = 1.23456789;

        System.out.printf("%f%n", f1);

        System.out.printf("%f%n", d);
        System.out.printf("%12.10f%n", d);

        System.out.printf("[S]%n", alpa);
        System.out.printf("[%30s]%n", alpa);
        System.out.printf("[%-30s]%n", alpa);
        System.out.printf("[%.8s]", alpa);
    }
}
