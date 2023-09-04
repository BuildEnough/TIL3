package Chapter5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {80, 100, 200, 150, 250, 50};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.printf("max: %d%n", max);
        System.out.printf("min: %d", min);
    }
}
