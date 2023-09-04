package Chapter5;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] += i + 1;
        }

        System.out.println(Arrays.toString(arr));

        int[] tmp = new int[(arr.length)*2];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;

        System.out.println(Arrays.toString(arr));

    }
}
