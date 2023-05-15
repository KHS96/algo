package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                arr[i][0] = 1;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }

            System.out.println("#"+tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] != 0 ){
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }


        }

    }
}
