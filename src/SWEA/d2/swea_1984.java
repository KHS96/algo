package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0;i<10;i++){
                int n = Integer.parseInt(st.nextToken());
                sum+=n;
                max = Math.max(max,n);
                min = Math.min(min,n);
            }
            System.out.println("#"+tc+" "+ Math.round((double)(sum-max-min)/8));

        }

    }
}
