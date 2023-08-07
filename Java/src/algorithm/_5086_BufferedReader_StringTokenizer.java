package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5086_BufferedReader_StringTokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

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
