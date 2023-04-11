package ObjectOrientedProgramming;

public class _8_CallStack1 {
    public static void main(String[] args) {firstMethod();}

    static void firstMethod() {secondMethod();}

    static void secondMethod() {System.out.println("secondMethod()");}
}
