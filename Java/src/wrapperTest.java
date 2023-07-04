public class wrapperTest {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i == i2); // false
        System.out.println(i.equals(i2)); // true
        System.out.println(i.compareTo(i2)); // 0
        System.out.println(i.toString()); // 100
        System.out.println();

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.SIZE + "bits"); // 32bits
        System.out.println(Integer.BYTES + "bytes"); // 4bytes
        System.out.println(Integer.TYPE);// int
    }
}