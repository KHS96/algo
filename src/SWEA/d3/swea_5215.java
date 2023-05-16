package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_5215 {
    static int N, L, max;
    static int[][] mat;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            mat = new int[N][2];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                mat[i][0] = Integer.parseInt(st.nextToken());
                mat[i][1] = Integer.parseInt(st.nextToken());
            }
            max = 0 ;
            select(0,0,0);


            System.out.println("#" + tc + " " + max);
        }
    }

    static void select(int idx, int scr, int cal){
        if(cal > L)
            return;
        if(cal <= L)
            max = Math.max(max,scr);
        if(idx==N)
            return;
        select(idx+1,scr+mat[idx][0],cal+mat[idx][1]);
        select(idx+1,scr,cal);
    }


}
