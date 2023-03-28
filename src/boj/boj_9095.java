package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9095 {
    public static void main(String[] args) throws IOException {
        int []dp = new int[12];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i=4;i<=11;i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i =0;i<n;i++){
            int t = Integer.parseInt(bf.readLine());
            System.out.println(dp[t]);
        }
    }
}
