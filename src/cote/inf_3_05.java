package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_3_05 {
    static int solution(int n) {
        int lt = 0;
        int sum = 0;
        int ans = 0;
        int m = n / 2 + 1;

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt <m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                ans++;
            }
            while(sum>n){
                sum -= arr[lt++];
                if(sum==n)
                    ans++;
            }

        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));


    }
}
