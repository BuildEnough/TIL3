package Chpater5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum =  0;
        float average = 0f;

        int[] score = {100, 200, 200, 300, 200};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        average = sum / (float) score.length;

        System.out.println(sum);
        System.out.println(average);
    }
}
