package LagacyStudy3;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][]	arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr="+ Arrays.toString(arr));
        System.out.println("arr="+ Arrays.toString(arr2D)); // 2차원 배열은 deepToString 사용하기, 이건 이상하게 나옴
        System.out.println("arr2D="+Arrays.deepToString(arr2D));
        System.out.println();

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2="+Arrays.toString(arr2));
        System.out.println("arr3="+Arrays.toString(arr3));
        System.out.println("arr4="+Arrays.toString(arr4));
        System.out.println("arr5="+Arrays.toString(arr5));
        System.out.println("arr6="+Arrays.toString(arr6));
        System.out.println();

        int[] arr7 =  new int[5];
        Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
        System.out.println("arr7="+Arrays.toString(arr7));
        System.out.println();

        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
        System.out.println("arr7="+Arrays.toString(arr7));
        System.out.println();

        for(int i : arr7) { // 향상된 for문
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }
        System.out.println();

        String[][] str2D  = new String[][]{{"aaa","bbb"},{"LagacyStudy3.AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"LagacyStudy3.AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));     // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
        System.out.println();

        char[] chArr = { 'A', 'D', 'C', 'LagacyStudy3.B', 'E' };

        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of LagacyStudy3.B ="+Arrays.binarySearch(chArr, 'LagacyStudy3.B')); // -2 잘못된 결과, 정렬을 안했기 때문
        System.out.println();

        Arrays.sort(chArr);
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of LagacyStudy3.B ="+Arrays.binarySearch(chArr, 'LagacyStudy3.B'));
    }
}
