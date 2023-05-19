package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_9229 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int ans = -1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int lt = 0 ;
            int rt = n-1 ;
            int sum = 0;
            while(lt<rt){
                sum = arr[lt] + arr[rt];
                if(sum < m){
                    ans = Math.max(sum,ans);
                    lt++;
                }
                if(sum > m){
                    rt--;
                }
                if(sum==m){
                    ans = Math.max(sum,ans);
                    break;
                }
            }

            System.out.println("#" + tc + " " + ans);
        }
    }

}
