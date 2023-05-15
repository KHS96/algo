package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class swea_1979 {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            int total = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 1) {
                        cnt++;
                    } else if (cnt >= 1 && arr[i][j] == 0) {
                        if (cnt == k)
                            total++;
                        cnt = 0;
                    }
                }
                if (cnt == k) total++;
                cnt = 0;
            }

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if (arr[i][j] == 1) {
                        cnt++;
                    } else if (cnt >= 1 && arr[i][j] == 0) {
                        if (cnt == k)
                            total++;
                        cnt = 0;
                    }
                }
                if (cnt == k) total++;
                cnt = 0;
            }
            System.out.println("#" + tc + " " + total);
        }
    }

}
