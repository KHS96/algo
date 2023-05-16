package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1206 {
    public static void main(String[] args) throws IOException {
        int map[][] = new int [1000][256];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1;tc<=10;tc++){
            int n = Integer.parseInt(br.readLine());
            int []arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int ans = 0;
            for(int i=2;i<n-2;i++){
                int max = Math.max(arr[i-2],Math.max(arr[i-1],Math.max(arr[i+1],arr[i+2])));

                if(max < arr[i]){
                    ans+= arr[i]-max;
                }
            }
            System.out.println("#" + tc + " " +ans);
        }
    }
}
