package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swea_12741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int []arr = new int[101];
            int ans = 0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            for(int i=a;i<=b;i++){
                arr[i]++;
            }
            for(int i=c;i<=d;i++){
                if(arr[i] == 1)
                    ans++;
            }


            ans = ans > 0 ? ans-1 : ans;
            System.out.println("#" + tc + " " + ans);
        }

    }

}
