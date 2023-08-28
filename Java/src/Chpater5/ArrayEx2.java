package Chpater5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[]{100, 90, 80, 70, 60};
        int[] arr4 = {100, 95, 90, 85, 80};
        char[] arr5 = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += i + 1;
        }
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += (int)(Math.random()*10) + 1;
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
        System.out.println();

        System.out.println(Arrays.toString(arr5));
        System.out.println(arr5);
    }
}
