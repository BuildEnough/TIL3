package Array;

public class _4_길이가_0인_배열 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int[] arr2 = new int[]{};
        int[] arr3 = {};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
