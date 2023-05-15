package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1946 {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;


        for (int tc = 1; tc <= t; tc++) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            int len = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String temp = st.nextToken();
                int k = Integer.parseInt(st.nextToken());
                for (int j = 0; j < k; j++) {
                    sb.append(temp);
                    if ( (sb.length() - len) % 10 == 0) {
                        sb.append("\n");
                        len++;
                    }
                }
            }
            System.out.println("#"+tc);
            System.out.println(sb);

        }
    }

}
