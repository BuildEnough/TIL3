package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1330_BufferedReader_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");


        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        String result = (A > B) ? ">" : ((A < B) ? "<" : "==");

        System.out.println(result);
    }
}
