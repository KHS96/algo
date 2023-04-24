package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int lt = 0;
        int rt = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        while(true){
            if ( sum >= m){
                sum -= arr[lt];
                ans = Math.min(ans,rt-lt);
                lt++;
            }else if(rt == n)
                break;
            else{
                sum += arr[rt++];
            }
        }
        if(ans == Integer.MAX_VALUE)
            System.out.println("0");
        else
            System.out.println(ans);

    }
}
