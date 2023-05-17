package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_14178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 1;
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            d = d*2+1;

            while(true){
                if(ans * d >= n)
                    break;
                ans++;
            }

            System.out.println("#" + tc + " " + ans);
        }
    }

}
