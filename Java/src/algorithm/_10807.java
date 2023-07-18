package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int find = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find)
                count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
