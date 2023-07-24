package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1330_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");


        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);


        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else System.out.println("==");

    }
}
