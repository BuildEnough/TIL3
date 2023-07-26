package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class _1330_BufferedReader_StringTokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        StringTokenizer st = new StringTokenizer(str, " ");


        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());


        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else System.out.println("==");

    }
}
