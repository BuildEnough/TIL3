package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5086_BufferedReader_split {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] num = br.readLine().split(" ");
            int f = Integer.parseInt(num[0]);
            int s = Integer.parseInt(num[1]);

            if (s == 0 && f == 0) break;

            if (s % f == 0) {
                System.out.println("factor");
            } else if (f % s == 0) {
                System.out.println("multiple");
            } else
                System.out.println("neither");
        }
    }
}
