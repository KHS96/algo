package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_9611 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int ans = 0;
            int[] num = new int[10];
            Arrays.fill(num, 1);
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                String chk = st.nextToken();
                if (chk.equals("YES")) {
                    num[a]++;
                    num[b]++;
                    num[c]++;
                    num[d]++;
                } else {
                    num[a]--;
                    num[b]--;
                    num[c]--;
                    num[d]--;
                }
            }
            int idx = -1;
            for (int j = 0; j < 10; j++) {
                if (idx < num[j]) {
                    ans = j;
                    idx = num[j];
                }
            }
            System.out.println("#" + tc + " " + ans);

        }

    }


}
