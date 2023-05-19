package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_9839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int ans = Integer.MIN_VALUE;

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    ans = Math.max(ans,Check(arr[i]*arr[j]));
                }
            }
                System.out.println("#" + tc + " " + ans);
        }

    }

    static int Check(int n) {
        String str = n + "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) - str.charAt(i) != 1)
                return -1;
        }

        return n;
    }


}
