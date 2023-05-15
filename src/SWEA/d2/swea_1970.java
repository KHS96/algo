package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int tc = 1; tc <= t; tc++) {
            int[] ans = new int[8];

            int n = Integer.parseInt(br.readLine());
            n = n / 10 * 10;

            for (int i = 0; i < money.length; i++) {
                int temp = n / money[i];
                ans[i] += temp;
                n -= temp * money[i];
            }
            System.out.println("#" + tc);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }


}
