package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_2817 {
    static int n, k, ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            ans = 0;

            dfs(0, 0);


            System.out.println("#" + tc + " " + ans);
        }
    }

    static void dfs(int start, int sum) {
        if (sum == k) {
            ans++;
            return;
        }
        if (start >= n)
            return;
        if (sum > k) {
            return;
        }

        dfs(start + 1, sum + arr[start]);
        dfs(start + 1, sum);

    }


}
