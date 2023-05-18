package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_9997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int ans = 0;

            int n = Integer.parseInt(br.readLine());

            int h = 2*n / 60;
            int m = 2*n % 60;

            System.out.println("#" + tc + " " + h + " " + m);
        }

    }


}
