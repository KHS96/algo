package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1209 {
    public static void main(String[] args) throws IOException {
        int map[][] = new int[1000][256];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc <= 10; tc++) {
            int[][] arr = new int[100][100];
            int x = Integer.parseInt(br.readLine());

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println("rowSum(arr) = " + rowSum(arr));
            System.out.println("colSum(arr) = " + colSum(arr));
            System.out.println("lcrossSum(arr) = " + lcrossSum(arr));
            System.out.println("rcrossSum(arr) = " + rcrossSum(arr));
            int ans = Math.max(rowSum(arr),Math.max(colSum(arr),Math.max(rcrossSum(arr),lcrossSum(arr))));
            System.out.println("#" + tc + " " + ans);
        }
    }

    static int rowSum(int[][]arr){
        int rs = 0;
        for(int i=0;i<100;i++){
            int sum = 0;
            for(int j=0;j<100;j++){
                sum+=arr[i][j];
            }
            rs = Math.max(sum,rs);
        }
        return rs;
    }

    static int colSum(int[][]arr){
        int rs = 0;
        for(int i=0;i<100;i++){
            int sum = 0;
            for(int j=0;j<100;j++){
                sum+=arr[j][i];
            }
            rs = Math.max(sum,rs);
        }
        return rs;
    }

    static int rcrossSum(int[][]arr){
        int rs = 0;
        for(int i=0;i<100;i++){
            rs+=arr[i][i];
        }
        return rs;
    }

    static int lcrossSum(int[][]arr){
        int rs = 0;
        for(int i=0;i<100;i++){
            rs+=arr[i][99-i];
        }
        return rs;
    }
}
