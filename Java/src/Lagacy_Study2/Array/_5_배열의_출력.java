package Lagacy_Study2.Array;

import java.util.Arrays;

public class _5_배열의_출력 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
