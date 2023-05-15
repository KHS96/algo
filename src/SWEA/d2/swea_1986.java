package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) sum -= i;
                else sum += i;
            }
            System.out.println("#"+tc+" "+ sum);

        }

    }
}
