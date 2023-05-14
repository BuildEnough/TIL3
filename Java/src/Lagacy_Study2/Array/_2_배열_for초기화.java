package Lagacy_Study2.Array;

public class _2_배열_for초기화 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

            System.out.println(arr[i]);
        }
    }
}
