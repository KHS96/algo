package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class swea_1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            Double[] score = new Double[n];
            double temp = 0.0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int m = Integer.parseInt(st.nextToken());
                int f = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                score[i] = m * 0.35 + f * 0.45 + p * 0.2;
            }
            temp = score[k - 1];
            Arrays.sort(score, Collections.reverseOrder());
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if (score[i] == temp) {
                    idx = i;
                    break;
                }
            }
            System.out.println(idx);
            idx = idx/(n/10);
            System.out.println("#"+tc+" " + grade[idx]);


        }

    }
}
