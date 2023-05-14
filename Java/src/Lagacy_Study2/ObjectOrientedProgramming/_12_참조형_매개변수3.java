package Lagacy_Study2.ObjectOrientedProgramming;

public class _12_참조형_매개변수3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 1, 6, 5, 4};

        printArr(arr);
        System.out.println();
        System.out.println(sumArr(arr));
    }

    static void printArr(int[] arr) {
        for (int i : arr)
            System.out.print(i);
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
