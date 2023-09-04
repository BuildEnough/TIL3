package Chapter5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();

        String tmp = names[2];
        System.out.println(tmp);
        System.out.println();

        names[0] = "Yu";
        for (String arr : names) {
            System.out.println(arr);
        }
    }
}
