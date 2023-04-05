package Array;

import java.util.Arrays;

public class _7_배열복사_arraycopy {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);

        System.out.println(result);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] copied = new int[15];
        System.arraycopy(arr, 0, copied, 1, arr.length);

        System.out.println(Arrays.toString(copied));
    }
}
