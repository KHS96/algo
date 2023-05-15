package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }


            System.out.println("#"+tc);
            for (int i = 0; i <n ; i++) {
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[j][i]);
                }
                System.out.print(" ");

                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[n-1-i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][n-i-1]);
                }
                System.out.println();
            }


        }

    }
}
