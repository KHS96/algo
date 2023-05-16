package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1208 {
    public static void main(String[] args) throws IOException {
        int map[][] = new int [1000][256];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1;tc<=10;tc++){
            int n = Integer.parseInt(br.readLine());
            int []arr = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<100;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int ans = 0;
            Arrays.sort(arr);

            for(int i=0;i<n;i++) {
                arr[0] += 1;
                arr[99] -= 1;
                Arrays.sort(arr);
            }

            System.out.println("#" + tc + " " + (arr[99]-arr[0]));
        }
    }
}
