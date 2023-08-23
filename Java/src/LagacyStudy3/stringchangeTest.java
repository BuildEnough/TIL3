package LagacyStudy3;

public class stringchangeTest {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("100")); // 100
        System.out.println(Integer.parseInt("100", 10)); // 100
        System.out.println(Integer.parseInt("100", 2)); // 4
        System.out.println(Integer.parseInt("100", 4)); // 16
        System.out.println(Integer.parseInt("100", 8)); // 64
        System.out.println(Integer.parseInt("100", 16)); // 256
        System.out.println(Integer.parseInt("FF", 16)); // 255
    }
}
