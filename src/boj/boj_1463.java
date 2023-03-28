package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int []dp = new int[1000001];
        int n = Integer.parseInt(bf.readLine());

        dp[0] = 0 ;
        dp[1] = 0;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1]+1;
            if(i%2==0)
                dp[i] = Math.min(dp[i/2]+1,dp[i]);
            if(i%3==0)
                dp[i] = Math.min(dp[i/3]+1,dp[i]);
        }
        System.out.println(dp[n]);
    }

    public static int func(int a, int b){
        return a>b ? b:a;
    }
}
